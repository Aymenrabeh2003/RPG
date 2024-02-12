import Character.Job.Job;
import Character.Job.Mage;
import Character.Race.Orc;
import Character.Characters;
import Item.Food.Food;
import Item.Food.Venon;
import Item.Jewellery.BaraDeLaVerdad;
import Item.Jewellery.Jewellery;
import Item.Weapons.Espada;
import Item.Weapons.Weapons;

public class Main {

    public static void main(String[] args) {

        Orc orco1 = new Orc();
        Job mage = new Mage();
        Food food = new Venon();
        Jewellery j1 = new BaraDeLaVerdad();
        Weapons sword = new Espada();

        Characters charac = new Characters("Este",orco1,mage);

        charac.consumes(food);
        System.out.println(charac);
        System.out.println();
        charac.equipJewelry(j1);
        System.out.println(charac);
        charac.equipWeapon(sword);
        System.out.println(charac);

    }
}
