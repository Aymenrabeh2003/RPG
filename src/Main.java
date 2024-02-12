import Character.Job.Job;
import Character.Job.Mage;
import Character.Race.Orc;
import Character.Characters;
import Item.Food.Food;
import Item.Food.Venon;
import Item.Jewellery.BaraDeLaVerdad;
import Item.Jewellery.Jewellery;

public class Main {

    public static void main(String[] args) {

        Orc orco1 = new Orc();
        Job mage = new Mage();
        Food food = new Venon();
        Jewellery j1 = new BaraDeLaVerdad();



       int valor = orco1.getConstitutionValue();


     //  System.out.println(valor);

        Characters charac = new Characters("Este",orco1,mage);
       // System.out.println(charac.velocity());

        charac.consumes(food);
        System.out.println(charac);
        System.out.println();
        charac.equipJewelry(j1);
        System.out.println(charac);

    }
}
