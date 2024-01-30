package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Orc extends Race{
    Stat strength = new Strength(5);
    Stat contitution = new Constitution(3);
    Stat intelligence = new Intelligence(-3);
    @Override
    public int modifier(Stat stat) {
        return 0;
    }
}
