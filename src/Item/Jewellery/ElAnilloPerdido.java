package Item.Jewellery;

import Item.*;
import Character.*;

public class ElAnilloPerdido extends Jewellery{
    //te sube la fuerza, pero te baja la intelligencia

    @Override
    public void applyEffects(Characters character) {
        int currentIntelligence = character.getIntell();
        character.setIntell(currentIntelligence + this.points - 4);
        int currentStrengh = character.getStreng();
        character.setStreng(currentStrengh + this.points);// tendrá -1 de intelligencia y +3 de fuerza
    }

    @Override
    public void removeEffects(Characters character) {
        int currentIntelligence = character.getIntell();
        character.setIntell(currentIntelligence - this.points + 4);
        int currentStrengh = character.getStreng();
        character.setStreng(currentStrengh - this.points);
    }
}
