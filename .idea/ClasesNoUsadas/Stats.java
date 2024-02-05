import Character.Stat.*;

public class Stats {
    private Stat strength;
    private Stat constitution;
    private Stat intelligence;
    private Stat dexterity;

    public Stats(int strength, int constitution, int intelligence, int dexterity){
        this.strength = new Strength(strength);
        this.constitution = new Constitution(constitution);
        this.intelligence = new Intelligence(intelligence);
        this.dexterity = new Dexterity(dexterity);
    }
    public Stats(Stats stats){
        this(stats.getStrength(), stats.getConstitution(), stats.getIntelligence(), stats.getDexterity());
    }
    // Default Stats
    public Stats(){
        this(0,0,0,0);
    }
    public int getStrength() {
        return strength.getValue();
    }

    public int getConstitution() {
        return constitution.getValue();
    }

    public int getIntelligence() {
        return intelligence.getValue();
    }

    public int getDexterity() {
        return dexterity.getValue();
    }
    public int modifier(Stat stat){
        if (stat instanceof Strength){
            return getStrength();
        }else if (stat instanceof Constitution){
            return getConstitution();
        }else if (stat instanceof Dexterity){
            return getDexterity();
        }else if (stat instanceof Intelligence){
            return getIntelligence();
        }else{
            return 0;
            //throw UnsupportedClassVersionError(""); //TODO
        }
    }
    // Suma los valores del parámetro stats sobre el objeto.
    public void addStats(Stats stats){
        addStat(stats.strength);
        addStat(stats.constitution);
        addStat(stats.dexterity);
        addStat(stats.intelligence);
    }
    public void addStat(Stat stat){
        if (stat instanceof Strength){
            strength.setValue(strength.getValue() + stat.getValue());
        }else if (stat instanceof Constitution){
            constitution.setValue(constitution.getValue() + stat.getValue());
        }else if (stat instanceof Dexterity){
            dexterity.setValue(dexterity.getValue() + stat.getValue());
        }else if (stat instanceof Intelligence){
            intelligence.setValue(intelligence.getValue() + stat.getValue());
        }else{
            //throw UnsupportedClassVersionError(""); //TODO
        }
    }
    // Sustituye los valores del objeto por los del stats pasado como parámetro
    public void renewStats(Stats stats){
        renewStat(stats.strength);
        renewStat(stats.constitution);
        renewStat(stats.dexterity);
        renewStat(stats.intelligence);
    }
    public void renewStat(Stat stat){
        if (stat instanceof Strength){
            strength.setValue(stat.getValue());
        }else if (stat instanceof Constitution){
            constitution.setValue(stat.getValue());
        }else if (stat instanceof Dexterity){
            dexterity.setValue(stat.getValue());
        }else if (stat instanceof Intelligence){
            intelligence.setValue(stat.getValue());
        }else{
            //throw UnsupportedClassVersionError(""); //TODO
        }
    }
}
