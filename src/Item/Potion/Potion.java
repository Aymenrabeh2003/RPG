package Item.Potion;
import Character.*;
import Item.Food.IConsumable;

public abstract class Potion implements IConsumable {

    public int power;
    public Potion(){
        power = 0;
    }
    @Override
    public void consumedBy(Characters character) {
        character.heals(power);
    }
}


