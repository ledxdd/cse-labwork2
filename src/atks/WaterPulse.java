package atks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class WaterPulse extends SpecialMove {
    public WaterPulse() {
        super(Type.WATER, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2) {
            Effect.confuse(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Water Pulse!";
    }
}
