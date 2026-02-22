import ru.ifmo.se.pokemon.*;
import pokemons.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Blissey("Чужой", 1);
        Pokemon p2 = new Clauncher("Хищник", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}