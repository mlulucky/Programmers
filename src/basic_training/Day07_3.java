package basic_training;

public class Day07_3 {
    public int[] solution(int start_num, int end_num) {
        int size = (end_num - start_num)+1;
        int[] answer= new int[size];
        
        int idx = 0;
        for(int i=start_num; i<=end_num; i++) { // 3, 10 -> 3,4,5,6,7,8,9,10
            answer[idx] = i;
            idx++;
        }
        
        return answer;
    }
}
