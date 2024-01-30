package Character.Race;

import Character.Stat.*;

public class Elf extends Race{

    public Elf(){
        Dexterity dexterity = new Dexterity(3);
        Constitution constitution = new Constitution(-1);
        Intelligence intelligence = new Intelligence(3);
    }

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity){
            return 0;
        }
        else if (stat instanceof Constitution){
            return 0;
        }
        else if (stat instanceof Intelligence){
            return 0;
        }
        return 0;
    }
}
