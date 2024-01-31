package Character.Race;

import Character.Stat.*;

public class Orc extends Race {
    private final Stat strength;
    private final Stat constitution;
    private final Stat intelligence;

    private int valueStrength = 5;
    private int valueConstitution = 3;
    private int valueIntelligence = -3;

    public Orc() {
        this.strength = new Strength(valueStrength);
        this.constitution = new Constitution(valueConstitution);
        this.intelligence = new Intelligence(valueIntelligence);
    }

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return strength.getValue();
        }
        else if (stat instanceof Constitution) {
            return constitution.getValue();
        }
        else if (stat instanceof Intelligence) {
            return intelligence.getValue();
        }
        return 0;
    }
}
