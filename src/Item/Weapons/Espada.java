package Item.Weapons;
import Character.*;

public class Espada extends Weapons{
    @Override
    public void applyEffects(Characters character) {
        character.setStreng(points*4);
        character.setDext(-points);
    }

    @Override
    public void removeEffects(Characters character) {
        character.setStreng(-points*4);
        character.setDext(+points);
    }
}
