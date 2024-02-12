package Item.Weapons;
import Item.*;
import Character.*;

public abstract class Weapons implements Equipment{

    public void applyEffects(Characters character) {
        int streng = character.getStreng();
        int newStreng = streng + points;
        character.setConsti(newStreng);
    }

    @Override
    public void removeEffects(Characters character) {
        int streng = character.getStreng();
        int newStreng = streng - points;
        character.setConsti(newStreng);
    }
}
