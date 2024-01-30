package Character.Race;

import Character.Stat.*;

public class Humano extends Race{
    Stat strength = new Strength(5);
    Stat contitution = new Constitution(2);
    Stat dexterity = new Dexterity(1);
    @Override
    public int modifier(Stat stat) {
        return 0;
    }
}
