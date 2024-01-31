import Character.Race.Humano;
import Character.Race.Orc;
import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Main {
    public static void main(String[] args) {
        Orc orco1 = new Orc();
        Humano humano1 = new Humano();
        Stat strength = new Strength(orco1.);
        strength.increase();
        Stat constitution = new Constitution(0);
        Stat intelligence = new Intelligence(0);

        orco1.modifier(strength);
    }
}
