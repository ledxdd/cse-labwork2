package pokemons;

import atks.FireBlast;
import atks.IceBeam;
import atks.Pound;
import atks.SeismicToss;
import ru.ifmo.se.pokemon.Type;

public final class Blissey extends Chansey {
    public Blissey(String name, int level) {
        super(name, level);

        setMove(
                new Pound(),
                new FireBlast(),
                new SeismicToss(),
                new IceBeam()
        );

        setType(
                Type.NORMAL
        );

        setStats(
                255,
                10,
                10,
                75,
                135,
                55
        );
    }
}
