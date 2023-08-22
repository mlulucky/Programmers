package basic_training;
import java.util.ArrayList;
import java.util.List;

public class Day07_2 {
    public int[] solution(int l, int r) {
        List<String> result = new ArrayList<>();
        
        for(int i= l; i<=r; i++) {
            String str = String.valueOf(i);
            if(str.startsWith("5") && str.matches("[05]+")) {        
                result.add(str);
            } 
        }
        if(result.isEmpty()) return new int[]{-1};

        // 방법 1. String 배열 int 배열로 변환
        return result.stream().mapToInt(Integer::parseInt).toArray();

        // 방법 2.
        // int[] answer = new int[result.size()];

        // for(int i=0; i<result.size(); i++) {
        //     String str = result.get(i);
        //     answer[i] = Integer.parseInt(str);
        // }
        // return answer;

    }
}
