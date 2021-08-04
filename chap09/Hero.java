public class Hero {
  String name;
  int hp;
  Sword sword;

  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に" + sword.damage + "ポイントのダメージをあたえた！");
  }

  public Hero(String name, Sword sword) { // コンストラクタ①
    this.hp = 100;
    this.name = name;
    this.sword = sword;
  }

  public Hero() { // コンストラクタ②
    this("ダミー", new Sword());
  }
}
