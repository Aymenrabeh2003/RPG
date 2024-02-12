package Item.Armor;

import Character.Stat.Constitution;
import Character.Stat.Stat;
import Item.*;
import Character.*;

public abstract class Armor implements Equipment {

    public int points = 2;
    public abstract void applyEffects(Characters character);
    public abstract void removeEffects(Characters character);
}
