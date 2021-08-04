public class Main {
  public static void main(String[] args) {
    Hero h1;
    // new Hero()で新たなヒーローを作成 この時にメモリにh1用の場所が確保されます。
    // h1という箱にはそのメモリの場所(アドレス)が入ります。
    h1 = new Hero();
    h1.hp = 100;
    Hero h2;
    // h2という箱にh1を入れています。
    // h2の箱にはh1のために用意されたアドレスが入ります。
    h2 = h1;
    // h2のhpを見つけにいき値を更新しようとしています。
    // h2の箱にはh1のアドレスが入っています。すなわちh1.hpを見ることになります。
    h2.hp = 200;
    // h1.hpを直接更新したわけではないですがh2の箱を通してh1の値が更新されています。
    System.out.println(h1.hp);

    Sword sword = new Sword();
    Hero h3 = new Hero("ミナト", sword);
    System.out.println(h3.name);
    Hero h4 = new Hero();
    System.out.println(h4.name);

  }
}
