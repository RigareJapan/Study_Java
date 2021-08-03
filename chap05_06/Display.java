import java.util.List;
import java.util.ArrayList;

public class Display {
    public static void main(String[] args) {
        methodA();

        System.out.println("メソッドを呼び出します");
        hello("湊");
        hello("朝香");
        hello("菅原");
        System.out.println("メソッドの呼び出しが終わりました");

        addShow(100, 20);
        addShow(200, 50);

        int ans = add(100, 10);
        System.out.println("100 + 10 = " + ans);

        // オーバーロード メソッド名が同じでも引数が異なれば(型や引数の数)エラーとはならずに自動的に正しいメソッドが呼び出される

        /* 1つ目のaddメソッドが呼び出される */
        System.out.println(add(10, 20));
        /* 2つ目のaddメソッドが呼び出される */
        System.out.println(add(3.5, 2.7));
        /* 3つ目のaddメソッドが呼び出される */
        System.out.println(add("Hello", "World"));

        // 配列も渡せます
        int[] array = { 1, 2, 3 };
        printArray(array);
        System.out.println();

        // 値渡しと参照渡し

        // 値渡し
        int before = 0;
        increment(before);
        System.out.println(before);

        // 参照渡し
        increment(array);
        for (int value : array) {
            System.out.print(value + " : ");
        }
        System.out.println();

        // 値渡し
        for (int value : array) {
            value++;
        }
        for (int value : array) {
            System.out.print(value + " : ");
        }
        System.out.println();

        // Java API
        // なぜ当たり前のように System.out.print で表示されるのか？
        // importがなければ使用できない
        List<String> arrayList = new ArrayList<>();

    }

    public static void methodA() {
        System.out.println("methodA");
        methodB();
    }

    public static void methodB() {
        System.out.println("methodB");
    }

    public static void hello(String name) {
        System.out.println(name + "さん、こんにちは");
    }

    // 複数の値を受け取るaddメソッド 受け取る値のことを引数と呼びます(x.y)
    public static void addShow(int x, int y) {
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
    }

    // 返す値を返り値と呼びます public static の後に返り値の型を書きます(int)

    // 1つ目のaddメソッド
    public static int add(int x, int y) {
        return x + y;
    }

    // 2つ目のaddメソッド
    public static double add(double x, double y) {
        return x + y;
    }

    // 3つ目のaddメソッド
    public static String add(String x, String y) {
        return x + y;
    }

    // returnの後に記載するとエラーとなる スコープ違反
    public static int sample() {
        // :
        return 1;
        // int x = 10;
    }

    // int型配列を受け取り、すべての要素を表示するメソッド
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " : ");
        }
    }

    public static void increment(int x) {
        x++;
    }

    public static void increment(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
}
