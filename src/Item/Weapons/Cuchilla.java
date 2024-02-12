package Item.Weapons;
import Character.*;

public class Cuchilla extends Weapons{
    public void applyEffects(Characters character) {
        character.setStreng(points*3);
    }

    @Override
    public void removeEffects(Characters character) {
        character.setStreng(-points*3);
    }
}
