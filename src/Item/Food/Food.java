package Item.Food;
import Character.*;

public abstract class Food implements IConsumable {
    public double power;

    public String name;

    @Override
    public void consumedBy(Characters character) {
        if (!character.isDead() || power < character.health()){
            if (power > 0){
                character.heals(power);
            } else if (power < 0) {
                power *= -1;
                character.receivesDamage(power);
            }
        }
    }
    public String getName(){
        return name;
    }
}
