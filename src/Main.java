import Character.Race.Humano;
import Character.Race.Orc;
import Character.Stat.*;

public class Main {

    public static void main(String[] args) {
        Stat constitution = new Constitution(0);
        Stat intelligence = new Intelligence(0);
        Stat dexterity = new Dexterity(0);
        Stat strength = new Strength(0);
        Orc orco1 = new Orc(strength,constitution,intelligence);
        Humano humano1 = new Humano();



       int valor = orco1.getConstitutionValue();


       System.out.println(valor);



    }
}
