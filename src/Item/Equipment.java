package Item;
import Character.*;

public interface Equipment {

    int points = 0;
    void applyEffects(Characters character);
    void removeEffects(Characters character);
}
