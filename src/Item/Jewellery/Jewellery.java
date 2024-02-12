package Item.Jewellery;
import Item.*;
import Character.*;

public abstract class Jewellery implements Equipment{
    public int points = 3;
    public abstract void applyEffects(Characters character);
    public abstract void removeEffects(Characters character);

}
