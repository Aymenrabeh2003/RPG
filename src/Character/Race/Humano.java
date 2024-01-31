package Character.Race;

import Character.Stat.*;

public class Humano extends Race{
    private final Stat strength;
    private final Stat constitution;
    private final Stat dexterity;

    public Humano(){
        this.strength = new Strength(5);
        this.constitution = new Constitution(2);
        this.dexterity = new Dexterity(1);
    }
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity){
            return dexterity.getValue();
        }
        else if (stat instanceof Constitution){
            return constitution.getValue();
        }
        else if (stat instanceof Strength){
            return strength.getValue();
        }
        return 0;
    }
}
