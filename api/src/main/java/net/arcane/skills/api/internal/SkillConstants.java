package net.arcane.skills.api.internal;

import java.util.concurrent.ThreadLocalRandom;

public final class SkillConstants {

    private static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

    public static double getVariableAmount(int max) {
        return RANDOM.nextInt(1, max);
    }

}
