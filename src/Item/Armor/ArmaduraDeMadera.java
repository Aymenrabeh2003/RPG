package Item.Armor;
import Character.*;
public class ArmaduraDeMadera extends Armor{
    //Realmente con la armadura se puede hacer la funcionalidad
    //de que tenga un valor nuevo, por encima del health y de que
    //si no es 0 no afecte a la vida del personaje. Pero en vez de
    //eso simplemente subirá la vida
    @Override
    public void applyEffects(Characters character) {
        character.setConsti(points);
        character.setDext(-points);
    }
    //menos agilidad y más vida
    @Override
    public void removeEffects(Characters character) {
        character.setConsti(-points);
        character.setDext(+points);
    }
}
