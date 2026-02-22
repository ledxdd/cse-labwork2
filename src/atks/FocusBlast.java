package atks;

import ru.ifmo.se.pokemon.*;

public final class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Focus Blast!";
    }
}
