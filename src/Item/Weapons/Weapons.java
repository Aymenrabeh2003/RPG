package Item.Weapons;
import Item.*;
import Character.*;

public abstract class Weapons implements Equipment{

    public int points = 4;
    public abstract void applyEffects(Characters character);
    public abstract void removeEffects(Characters character);
}
