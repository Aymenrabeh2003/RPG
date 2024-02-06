package Character.Job;

import Character.Stat.*;

public class Mage extends Job{
    Intelligence intelligence = new Intelligence(4);
    Dexterity dexterity = new Dexterity(1);

    Stat statOfIntelligence = intelligence;
    Stat statOfDexterity = dexterity;
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence){
            return statOfIntelligence.getValue();
        }
        else if (stat instanceof Dexterity){
            return statOfDexterity.getValue();
        }
        return 0;
    }
}
