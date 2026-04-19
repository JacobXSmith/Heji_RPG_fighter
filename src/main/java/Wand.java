public class Wand extends Weapon {
    public Wand(){
        super((int) (Math.random() * 6) + 10, //10-15 dmg
                (int) (Math.random() * 6) + 2); //2-7 mana used
    }
}
