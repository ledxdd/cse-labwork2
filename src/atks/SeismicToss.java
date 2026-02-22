package atks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class SeismicToss extends PhysicalMove {
    public SeismicToss() {
        super(Type.FIGHTING, 0, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        return att.getLevel();
    }

    @Override
    protected String describe() {
        return "использует Seismic Toss!";
    }
}
