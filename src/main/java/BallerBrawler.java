public class BallerBrawler extends Character
{
    public BallerBrawler(String name)
    {
        super((int) (Math.random() * 11) + 30, // 30-40 hp
                0, // 0 mana :derp:
                new Weapon((int) (Math.random() * 6) + 10,1), // 10-15 damage w/ no spells
                new Armor((int) (Math.random() * 6) + 20, (int) (Math.random() * 21) + 100), // 15-25 armor, 80-120 pounds
                name,
                5, // 5 inv slots
                (int) (Math.random() * 6) + 15); // 10-20 speed;
    }
    public boolean speedDodge(int enemySpeed) // TO HEIDI/EMILY/INGRID - YALL CAN COPY THIS IDRC / PUT IN MAIN
    {
        int speedDiff = getSpeed() - enemySpeed;
        if(speedDiff > 0)
        {
            return (double)(1-(1/(speedDiff+1))) > ((Math.random() * 101) / 100); // (1-(1/(speedDiff+1)) exponentially increases chances (i.e. 50 speed = 98% chance of dodging)
        }
        return false;
    }
    public int bowlingStrike()
    {
        return getWeapon().getDamage() * 10;
    }

}
