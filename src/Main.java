import Character.Job.Job;
import Character.Job.Mage;
import Character.Race.Orc;
import Character.Characters;
import Item.Food.Food;
import Item.Food.Venon;

public class Main {

    public static void main(String[] args) {

        Orc orco1 = new Orc();
        Job mage = new Mage();
        Food food = new Venon();



       int valor = orco1.getConstitutionValue();


     //  System.out.println(valor);

        Characters charac = new Characters("Este",orco1,mage);
       // System.out.println(charac.velocity());

        charac.consumes(food);
        System.out.println(charac);

    }
}
