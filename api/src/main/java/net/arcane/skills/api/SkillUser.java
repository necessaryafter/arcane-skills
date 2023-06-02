package net.arcane.skills.api;

import lombok.Builder;
import lombok.Data;
import net.arcane.skills.api.booster.Booster;
import net.arcane.skills.api.internal.SkillConstants;
import net.arcane.skills.api.internal.SkillMap;
import net.arcane.skills.api.skill.Skill;
import net.arcane.skills.api.skill.enumeration.SkillType;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

@Data @Builder
public final class SkillUser {

    private final String playerName;
    private final SkillMap skillMap;
    private Booster booster;

    public void trackLevelAdvancement(@NotNull SkillType skillType, int gainedRawExperience) {
        final Optional<Skill> skillOptional = this.skillMap.getOptional(skillType);
        skillOptional.ifPresent(skill -> {
            final double experience = skill.getExperience();
            final double experienceNeed = skill.getExperienceNeed();

            double gainedExperiece = SkillConstants.getVariableAmount(gainedRawExperience);
            if(hasBooster()) gainedExperiece *= 2;

            skill.setExperience(experience + gainedExperiece);

            if(experience >= experienceNeed) {
                skill.setLevel(skill.getLevel() + 1);
            }
        });
    }

    public boolean hasBooster() {
        return this.booster != null;
    }

}
