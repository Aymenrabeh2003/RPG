package Item.Jewellery;
import Character.*;
import Item.*;

public class BaraDeLaVerdad extends Jewellery{
    @Override
    public void applyEffects(Characters character) {
        character.setIntell(points);
    }

    @Override
    public void removeEffects(Characters character) {
        character.setIntell(-points);
    }
}
