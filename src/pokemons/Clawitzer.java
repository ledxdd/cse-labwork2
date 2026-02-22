package pokemons;

import atks.DoubleTeam;
import atks.DragonPulse;
import atks.VenoShock;
import atks.WaterPulse;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Clawitzer extends Clauncher {
    public Clawitzer(String name, int level) {
        super(name, level);

        setType(
                Type.WATER
        );

        setStats(
                71,
                73,
                88,
                120,
                89,
                59
        );

        setMove(
                new WaterPulse(),
                new DoubleTeam(),
                new VenoShock(),
                new DragonPulse()
        );
    }
}
