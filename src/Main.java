import Character.Job.Job;
import Character.Job.Mage;
import Character.Race.Humano;
import Character.Race.Orc;
import Character.Stat.*;
import Character.Characters;

public class Main {

    public static void main(String[] args) {

        Orc orco1 = new Orc();
        Humano humano1 = new Humano();
        Job mage = new Mage();



       int valor = orco1.getConstitutionValue();


     //  System.out.println(valor);

        Characters charac = new Characters("Este",orco1,mage);
       // System.out.println(charac.velocity());

        System.out.println(charac);

    }
}
