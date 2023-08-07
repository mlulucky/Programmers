package basic_training;

public class Day04_3 {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<=n; i=i+2) {
            answer = n % 2 == 0 ? answer + (int) Math.pow(i,2) : answer + (i+1);
        }
        return answer;
    }
}
