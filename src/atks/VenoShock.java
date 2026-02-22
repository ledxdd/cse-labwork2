package atks;

import ru.ifmo.se.pokemon.*;

public final class VenoShock extends SpecialMove {
    public VenoShock() {
        super(Type.POISON, 65, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        if (def.getCondition() == Status.POISON) {
            return super.calcBaseDamage(att, def) * 2;
        } else {
            return super.calcBaseDamage(att, def);
        }
    }

    @Override
    protected String describe() {
        return "использует Veno Shock!";
    }
}
