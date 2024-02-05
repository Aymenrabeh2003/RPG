package Character.Race;

import Character.Stat.*;

public class Orc extends Race {
    int valueStrength = 5;
    int valueConstitution = 3;
    int valueIntelligence = -3;
    private final Stat strength;
    private final Stat constitution;
    private final Stat intelligence;

    public Orc(Stat strength, Stat constitution, Stat intelligence) {

        strength = new Strength(valueStrength);
        this.strength = strength;
        constitution = new Constitution(valueConstitution);
        this.constitution = constitution;
        intelligence = new Intelligence(valueIntelligence);
        this.intelligence = intelligence;
    }

    public int getStrengthValue() {
        return valueStrength;
    }

    public int getConstitutionValue() {
        return valueConstitution;
    }

    public int getIntelligenceValue() {
        return valueIntelligence;
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
