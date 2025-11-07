public class SwordMan extends Role{
    public SwordMan(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    public void attack(SwordMan opponent) {
        opponent.setHealth(opponent.getHealth() - this.getattackPower);
        System.out.println(this.getName + " attacks " + opponent.getName() + " for " + this.getAttackPower() + " damage.");
    }
}
