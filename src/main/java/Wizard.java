public class Wizard extends Character {
    public Wizard(Wand weapons, Armor armors, String names) {
        super((int) (Math.random() * 11) + 10,   // 10–20 health
                (int) (Math.random() * 6) + 20,     // 20–25 mana
                weapons, armors, names, //supers these
                1, //1 inventory
                (int) (Math.random() * 10) + 1); // 1-10 speed
    }
}
