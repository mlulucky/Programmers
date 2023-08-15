package basic_training;

public class Day05_5 {
    public int solution(int[] num_list) {
        
        StringBuilder evenSb = new StringBuilder();
        StringBuilder oddSb = new StringBuilder();

        for(int num : num_list) {
            if(num % 2 == 0) evenSb.append(num);
            if(num % 2 == 1) oddSb.append(num);
        }

        int even = Integer.parseInt(evenSb.toString());
        int odd = Integer.parseInt(oddSb.toString());

        return even + odd;
    }
}
