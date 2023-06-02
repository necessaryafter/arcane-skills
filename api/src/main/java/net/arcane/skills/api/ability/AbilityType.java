package net.arcane.skills.api.ability;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor @Getter
public enum AbilityType {

    /**
     * Swords abilities
     */
    CRITICAL("Golpe Crítico", 150, 0.5),
    BLEED("Sangramento", 350, 0.25),

    /**
     * Axes abilities
     */
    SLOWNESS("Lentidão", 125, 0.5),
    THOR("Thor", 350, 0.03),

    /**
     * Excavation abilities
     */
    BLOCK_BREAK_AREA("Super Área", 250, 100),

    /**
     * Herbalism ability
     */
    PLANT_BREAK_AREA("Super Área", 150, 100),

    /**
     * Acrobatics ability
     */
    ROLLING("Rolando", 100, 0.5);

    private final String name;
    private final int level;
    private final double chance;

}
