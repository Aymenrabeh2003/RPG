package Item.Jewellery;
import Character.*;
import Item.*;

public class BaraDeLaVerdad extends Jewellery{
    @Override
    public void applyEffects(Characters character) {
        int currentIntelligence = character.getIntell();
        character.setIntell(currentIntelligence + this.points);
    }

    @Override
    public void removeEffects(Characters character) {
        int currentIntelligence = character.getIntell();
        character.setIntell(currentIntelligence - this.points);
    }
}
