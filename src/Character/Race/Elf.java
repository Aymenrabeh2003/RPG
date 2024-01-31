package Character.Race;

import Character.Stat.*;

public class Elf extends Race{

    private final Stat dexterity;
    private final Stat constitution;
    private final Stat intelligence;

    public Elf(){
        this.dexterity = new Dexterity(3);
        this.constitution = new Constitution(-1);
        this.intelligence = new Intelligence(3);
    }

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity){
            return dexterity.getValue();
        }
        else if (stat instanceof Constitution){
            return constitution.getValue();
        }
        else if (stat instanceof Intelligence){
            return intelligence.getValue();
        }
        return 0;
    }
}
