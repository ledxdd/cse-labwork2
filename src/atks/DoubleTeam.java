package atks;


import ru.ifmo.se.pokemon.*;

public final class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect()
                .stat(Stat.EVASION, +1)
                .turns(0);

        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует double Team!";
    }
}
