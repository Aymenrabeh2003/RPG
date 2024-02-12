package Item.Armor;

import Character.Stat.Constitution;
import Character.Stat.Stat;
import Item.*;
import Character.*;

public abstract class Armor implements Equipment {

    @Override
    public void applyEffects(Characters character) {
        int constit = character.getConsti();
        int newConstit = constit + points;
        character.setConsti(newConstit);
    }

    @Override
    public void removeEffects(Characters character) {
        int constit = character.getConsti();
        int newConstit = constit - points;
        character.setConsti(newConstit);
    }
}
