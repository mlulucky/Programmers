package basic_training;

public class Day04_1 {
    public int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0) {
            answer = 1;
        }
        return answer;
    }
}
