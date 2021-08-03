public class Answer {
  public static void main(String[] args) {
    int[][] scores = { { 20, 30, 40, 50, 80 }, { 20, 30, 40, 50, 80 } };
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; i++) {
        sum += scores[i][j];
      }
    }
    System.out.println("ふたりの全ての科目の合計点数は:" + sum);
  }
}
