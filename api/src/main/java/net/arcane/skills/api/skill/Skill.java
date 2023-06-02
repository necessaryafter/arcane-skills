package net.arcane.skills.api.skill;

import lombok.Builder;
import lombok.Data;
import net.arcane.skills.api.skill.enumeration.SkillType;

@Data @Builder
public final class Skill {

    private final SkillType skillType;
    private double level, experience, experienceNeed;

}
