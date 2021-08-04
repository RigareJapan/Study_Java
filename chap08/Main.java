public class Main {
  public static void main(String[] args) {
    // ヒーロー・ミナトを誕生させたい 雛形であるHeroクラス(オブジェクト)からインスタンスを作成する。
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;

    // 敵キャラ1を作成
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    // 敵キャラ2を作成
    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    // 冒険のはじまり
    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}
