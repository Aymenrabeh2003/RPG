package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.*;
import Item.Armor.Armor;
import Item.Food.IConsumable;
import Item.Jewellery.Jewellery;
import Item.Weapons.Weapons;

import java.util.WeakHashMap;

public class Characters implements IDamageable{

    private final String name;
    private final Race race;
    private final Job job;
    private Stat strength;
    private Stat dexterity;
    private Stat constitution;
    private Stat intelligence;
    private double currentHealth;
    private Weapons weapon;
    private Armor armor;
    private Jewellery jewelry;

    public Characters(String name, Race race, Job job) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = new Strength(5);
        this.dexterity = new Dexterity(5);
        this.constitution = new Constitution(5);
        this.intelligence = new Intelligence(5);
        this.currentHealth = maxHealth();
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
    public void equipWeapon(Weapons weapon) {
        if (this.weapon != null) {
            this.weapon.removeEffects(this);
        }
        this.weapon = weapon;
        weapon.applyEffects(this);
    }

    public void equipArmor(Armor armor) {
        if (this.armor != null) {
            this.armor.removeEffects(this);
        }
        this.armor = armor;
        armor.applyEffects(this);
    }

    public void equipJewelry(Jewellery jewelry) {
        if (this.jewelry != null) {
            this.jewelry.removeEffects(this);
        }
        this.jewelry = jewelry;
        jewelry.applyEffects(this);
    }
    public int setConsti(int points){
        return getConsti() + points;
    }
    public int setStreng(int points){
        return getStreng() + points;
    }
    public int setDext(int points){
        return getDext() + points;
    }
    public int setIntell(int points){
        return getIntell() + points;
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

        return currentHealth;
    }

    @Override
    public boolean isDead() {
        return currentHealth <= 0;
    }

    @Override
    public void receivesDamage(double amount) {
        currentHealth -= amount;
        if (currentHealth < 0) {
            currentHealth = 0;
        }
        System.out.println(getName()+" received "+amount+" damage. "+currentHealth+"/"+maxHealth());
    }

    @Override
    public void heals(double amount) {
        currentHealth += amount;
        if (currentHealth > maxHealth()){
            currentHealth = maxHealth();
        }
        System.out.println(getName()+" heals "+amount+" life. "+currentHealth+"/"+maxHealth());

    }

    public void consumes(IConsumable consumable) {

        consumable.consumedBy(this);
        System.out.println(getName()+" Consumed: " + consumable.getClass().getSimpleName());

    }




    @Override
    public String toString() {
        return "My name is " + getName() + ". I’m an " + getRace() + " " + getJob() + " My stats are: Strength: " + getStreng() +
                "\nDexterity: " + getDext() + " Constitution: " + getConsti() + " Intelligence: " + getIntell() +
                " Velocity: " + velocity() + " Power: " + power() + " Magic: " + magic() + " Actual Health: " + health() + "";
    }
}
