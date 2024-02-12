package Item.Jewellery;

import Item.*;
import Character.*;

public class ElAnilloPerdido extends Jewellery{
    //te sube la fuerza, pero te baja la intelligencia

    public void applyEffects(Characters character) {
        character.setIntell(points - 4);
        character.setStreng(points);
    }

    @Override
    public void removeEffects(Characters character) {
        character.setIntell(points + 4);
        character.setStreng(-points);
    }
}
