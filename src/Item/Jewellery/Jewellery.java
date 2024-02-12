package Item.Jewellery;
import Item.*;
import Character.*;

public abstract class Jewellery implements Equipment{

    public void applyEffects(Characters character) {
        int constit = character.getConsti();
        int newConstit = constit + points;
        int constit = character.getConsti();
        int newConstit = constit + points;
        int constit = character.getConsti();
        int newConstit = constit + points;
        int constit = character.getConsti();
        int newConstit = constit + points;
        character.setConsti(newConstit);
        character.setDext(newConstit);
        character.setStreng(newConstit);
        character.setIntell(newConstit);
    }

    @Override
    public void removeEffects(Characters character) {
        int constit = character.getConsti();
        int newConstit = constit - points;
        character.setConsti(newConstit);
    }

}
