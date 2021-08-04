public class Wizard {
    String name;
    int hp;
    int mp;
    int level;

    public void magic() {
        if (this.mp - 5 < 0) {
            this.mp -= 5;
            System.out.println("魔術師は敵に" + (level * 5) + "のダメージを与えた!");
        } else {
            System.out.println("魔術師はMP不足だ！");
        }
    }

    public void heal() {
        System.out.println("魔術師はMPを" + (level * 3) + "回復した!");
        this.mp += 3;
    }

}
