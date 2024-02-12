package Item.Armor;
import Character.*;
public class ArmaduraDeMetal extends Armor{
    @Override
    public void applyEffects(Characters character) {
        character.setConsti(points*2);
        character.setDext(-points*2);
    }
    //menos agilidad y más vida
    @Override
    public void removeEffects(Characters character) {
        character.setConsti(-points*2);
        character.setDext(+points*2);
    }
}
