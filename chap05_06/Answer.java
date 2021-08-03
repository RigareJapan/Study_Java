public class Answer {
    public static void main(String[] args) {
        double ｔrapezoidArea = calcTrapezoidArea(7.0, 10.0, 5.0);
        System.out.println("台形の面積：" + ｔrapezoidArea + "平方cm");

        printText(1);
        printText(1.0);
    }

    public static double calcTrapezoidArea(double top, double bottom, double height) {
        double area = ((top + bottom) * height) / 2;
        return area;
    }

    public static void printText(double value) {
        System.out.println("double型です");
    }

    public static void printText(int value) {
        System.out.println("int型です");
    }

}
