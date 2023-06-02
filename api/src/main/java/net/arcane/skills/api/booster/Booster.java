package net.arcane.skills.api.booster;

import lombok.Builder;
import lombok.Data;

import java.util.concurrent.TimeUnit;

@Data @Builder
public final class Booster {

    private final long activatedAt;
    private final double multiplier;

    public boolean isExpired() {
        final long endAt = activatedAt + TimeUnit.MINUTES.toMillis(30);
        return activatedAt <= endAt;
    }

}
