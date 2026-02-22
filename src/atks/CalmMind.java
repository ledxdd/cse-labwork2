package atks;

import ru.ifmo.se.pokemon.*;

public final class CalmMind extends StatusMove {
    public CalmMind() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect()
                .stat(Stat.SPECIAL_ATTACK, +1)
                .stat(Stat.SPECIAL_DEFENSE, +1)
                .turns(0);

        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Calm Mind!";
    }
}
