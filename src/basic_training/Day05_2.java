package basic_training;
import java.util.ArrayList;

public class Day05_2 {
    public int solution(int a, int b, boolean[] included) {
        int sum = 0;
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for (int i = 0; i < included.length; i++) {
            intArr.add(a + i * b);
            if (included[i]) sum += intArr.get(i);
        }

        return sum;
    }

}
