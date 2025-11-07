public class Magician {
    private String name;
    private int health;
    private int magicPower;


        this.attacpublic Magician(String name, int health, int magicPower) {
        this.name = name;
        this.health = health;
        this.magicPower = magicPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void attack(Magician opponent) {
        opponent.setHealth(opponent.getHealth() - this.magicPower);
        System.out.println(this.name + " casts a spell on " + opponent.getName() + " for " + this.magicPower + " damage.");
    }

    private void heal(int amount) {
        this.health += amount;
        System.out.println(this.name + " heals for " + amount + " health.");
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}