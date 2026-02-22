package atks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class Pound extends PhysicalMove {
    public Pound() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "использует Pound!";
    }
}
