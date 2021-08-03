public class Task {
    public static void main(String[] args) {
        double triangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の面積：" + triangleArea + "平方cm");

        // 台形の面積を算出する calcTrapezoidArea メソッドを作成してください。
        // 三角形の面積がヒントです。
        double ｔrapezoidArea = calcTrapezoidArea(7.0, 10.0, 5.0);
        System.out.println("台形の面積：" + ｔrapezoidArea + "平方cm");

        // int型の値を受け取ったら「int型です」、double型の値を受け取ったら「double型です」と表示させる printText
        // を作成して実行してください。
        // printTextは２つ作成します(オーバーロード) 返り値はvoidでメソッド内で System.out.println を実行してください。

        printText(1);
        printText(1.0);
    }

    // ヒント 三角形の面積
    public static double calcTriangleArea(double bottom, double height) {
        double area = (bottom * height) / 2;
        return area;
    }
}
