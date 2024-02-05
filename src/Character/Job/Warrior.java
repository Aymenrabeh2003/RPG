package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Warrior extends Job{

    Strength strength = new Strength(3);
    Constitution constitution = new Constitution(2);

    Stat statOfStrength = strength;
    Stat statOfConstitution = constitution;
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitution){
            return statOfConstitution.getValue();
        }
        else if (stat instanceof Strength){
            return statOfStrength.getValue();
        }
        return 0;
    }

}
