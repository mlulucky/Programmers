package basic_training;

public class Day06_1 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1]; // array 배열에 요소를 하나 더 추가하기 위해서 length + 1 
        
        int idx = 0;
        for(int num : num_list) {
            answer[idx] = num;
            idx++;
        }

        int lastNum = num_list[num_list.length - 1];
        int beforeLastNum = num_list[num_list.length - 2];

        answer[num_list.length] = beforeLastNum < lastNum ? lastNum-beforeLastNum : lastNum * 2;
        // answer 배열의 마지막 요소가 num_list.length + 1 이 아니고 num_list.length 인 이유?
        // 예) length + 1 이 6 일때, new int[6] -> 배열은 6개의 요소를 가진다. length 는 6! 이때 인덱스는 마지막 인덱스는 5(length) 
        
        return answer;
    
    }
    
}
