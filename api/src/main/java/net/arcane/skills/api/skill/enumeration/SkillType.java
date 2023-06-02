package net.arcane.skills.api.skill.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.arcane.skills.api.ability.AbilityType;

@RequiredArgsConstructor @Getter
public enum SkillType {

    SWORDS("Espadas", new AbilityType[] { AbilityType.BLEED, AbilityType.CRITICAL }),
    AXES("Machados", new AbilityType[] { AbilityType.THOR, AbilityType.SLOWNESS }),
    HERBALISM("Herbalismo", new AbilityType[] { AbilityType.PLANT_BREAK_AREA }),
    EXCAVATION("Escavação", new AbilityType[] { AbilityType.BLOCK_BREAK_AREA }),
    ACROBATICS("Acrobacia", new AbilityType[] { AbilityType.ROLLING });

    private final String name;
    private final AbilityType[] abilities;

}
