package basic_training;

public class Day05_4 {
    public int solution(int[] num_list) {
        int sumNum=0;
        int multiNum=1;

        for(int num : num_list) {
            sumNum += num; // 모든 원소들의 합
            multiNum *= num; // 모든 원소들의 곱
        }

        int answer = multiNum < sumNum * sumNum ? 1 : 0;

        return answer;
    }
}
