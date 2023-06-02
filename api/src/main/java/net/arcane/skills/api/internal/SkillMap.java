package net.arcane.skills.api.internal;

import com.google.common.collect.ImmutableMap;
import net.arcane.skills.api.skill.Skill;
import net.arcane.skills.api.skill.enumeration.SkillType;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.Optional;

public final class SkillMap extends EnumMap<SkillType, Skill> {

    public SkillMap() {
        super(SkillType.class);
    }

    public SkillMap(@NotNull ImmutableMap<SkillType, Skill> skillMap) {
        super(SkillType.class);
        putAll(skillMap);
    }

    public Optional<Skill> getOptional(Object key) {
        return Optional.ofNullable(super.get(key));
    }
}
