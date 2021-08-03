public class Display {
  public static void main(String[] args) {
    // 宣言＆初期化
    int[] scores1 = new int[5];

    // 配列.length = 配列の要素の数
    int num = scores1.length;
    System.out.println("要素の数: " + num);

    // 配列(箱)に値を代入 要素の指定は0スタート score[1]は箱の中身の2つ目を指す
    scores1[1] = 30;
    System.out.println(scores1[1]);

    // 宣言＆初期化の際に箱の中身を入れることができる
    int[] scores = { 20, 30, 40, 50, 80 };
    int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
    System.out.println("合計点:" + sum);

    sum = 0;
    // for文を使えばこう書ける
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }

    sum = 0;
    // 拡張for文
    for (int value : scores) {
      sum += value;
    }

    int avg = sum / scores.length;
    System.out.println("平均点:" + avg);

    int count = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 50) {
        count++;
      }
    }
    System.out.println("50点以上の科目の数は:" + count);

    int[] arrayA = { 1, 2, 3 };
    int[] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;
    System.out.println(arrayA[0]);

    int[] array = { 1, 2, 3 };
    // array = null;
    // array = new int[5];
    array[0] = 10;

    int[][] scores2 = new int[2][3];
    scores2[0][0] = 40;
    scores2[0][1] = 50;
    scores2[0][2] = 60;
    scores2[1][0] = 80;
    scores2[1][1] = 60;
    scores2[1][2] = 70;
    System.out.println(scores2[1][1]);

    int[][] scores3 = { { 40, 50, 60 }, { 80, 60, 70 } };
    System.out.println(scores3.length);
    System.out.println(scores3[0].length);

  }
}
