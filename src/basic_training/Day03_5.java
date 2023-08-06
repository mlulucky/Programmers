package basic_training;

public class Day03_5 {
    public static int solution(int a, int b) {

        int AB = Integer.parseInt("" + a + b);
        int multiAB = 2 * a * b;

        return Math.max(AB,multiAB);
    }
}
