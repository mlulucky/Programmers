package basic_training;

public class Day04_5 {
    public int solution(int a, int b, boolean flag) {
        int answer = flag ?  a + b : a - b;
        return answer;
    }
}
