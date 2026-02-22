package pokemons;

import atks.Bulldoze;
import atks.CalmMind;
import atks.FireBlast;
import atks.FocusBlast;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Dhelmise extends Pokemon {
    public Dhelmise(String name, int level) {
        super(name, level);

        setType(
                Type.GHOST,
                Type.GRASS
        );

        setStats(70, // HP
                131, // ATK
                100, // DEF
                86, // SP_ATK
                90, // SP_DEF
                40 // SPD
        ); //

        setMove(
                new FireBlast(),
                new CalmMind(),
                new FocusBlast(),
                new Bulldoze()
        );

    }
}
