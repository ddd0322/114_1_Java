public class RPG {
    public static void main(String[] args) {
        SwordMan swordMan_White = new SwordMan("光明劍士", 100, 20);
        SwordMan swordMan_dark = new SwordMan("黑暗劍士", 100, 205);

        Magician magician_fire = new Magician("火焰魔法師", 80, 25);
        Magician magician_ice = new Magician("冰霜魔法師", 80, 30);

        // 戰鬥開始
        System.out.println("戰鬥開始");
        swordMan_White.attack(swordMan_dark);
        magician_fire.attack(magician_ice);
        swordMan_dark.attack(swordMan_White);
        magician_ice.attack(magician_fire);
    }
}