
import java.util.Arrays;
import java.util.Scanner;

public class program1 {
  public static void curveScores(int scores[], int num) {
    for (int i = 0; i < scores.length; i++) {
      scores[i] = scores[i] + num;
    }
    System.out.println(Arrays.toString(scores));
  }

  public static void main(String[] arg) {
    int[] scores = { 70, 85, 60 };
    curveScores(scores, 10);
  }

}
