package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.*;
import Item.Food.IConsumable;

public class Characters implements IDamageable{

    private final String name;
    private final Race race;
    private final Job job;
    private final Stat strength;
    private final Stat dexterity;
    private final Stat constitution;
    private final Stat intelligence;

    public Characters(String name, Race race, Job job) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = new Strength(5);
        this.dexterity = new Dexterity(5);
        this.constitution = new Constitution(5);
        this.intelligence = new Intelligence(5);
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }

    public int getStreng() {
        return strength.getValue() + race.modifier(strength) + job.modifier(strength);
    }

    public int getDext() {
        return dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity);
    }

    public int getConsti() {
        return constitution.getValue() + race.modifier(constitution) + job.modifier(constitution);
    }

    public int getIntell() {
        return intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence);
    }

    public double velocity() {
        return getDext() * 2;
    }

    public double power() {
        return getStreng() * 2;
    }

    public double magic() {
        return getIntell() * 2;
    }

    @Override
    public double maxHealth() {
        return getConsti() * 25;
    }

    public double health() {

        return maxHealth();
    }

    @Override
    public boolean isDead() {
        return health() == 0;
    }

    @Override
    public void receivesDamage(double amount) {
        double health = health();
        health -= amount;
        System.out.println(getName()+" received "+amount+" damage. "+health+"/"+maxHealth());
    }

    @Override
    public void heals(double amount) {
        double health = health();
        health += amount;
        System.out.println(getName()+" heals "+amount+" life. "+health+"/"+maxHealth());
    }

    public void consumes(IConsumable consumable) {

    }

    @Override
    public String toString() {
        return "My name is " + getName() + ". I’m an " + getRace() + " " + getJob() + " My stats are: Strength: " + getStreng() +
                "\nDexterity: " + getDext() + " Constitution: " + getConsti() + " Intelligence: " + getIntell() +
                " Velocity: " + velocity() + " Power: " + power() + " Magic: " + magic() + " Health: " + maxHealth() + "";
    }
}
