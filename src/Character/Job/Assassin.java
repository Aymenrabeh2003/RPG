package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Assassin extends Job{
    Strength strength = new Strength(1);
    Constitution constitution = new Constitution(1);

    Dexterity dexterity = new Dexterity(3);

    Stat statOfStrength = strength;
    Stat statOfConstitution = constitution;
    Stat statOfDexterity = dexterity;
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitution){
            return statOfConstitution.getValue();
        }
        else if (stat instanceof Strength){
            return statOfStrength.getValue();
        }
        else if (stat instanceof Dexterity) {
            return statOfDexterity.getValue();
        }
        return 0;
    }
}
