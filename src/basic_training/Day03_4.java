package basic_training;

public class Day03_4 {
    
    public static int solution(int a, int b) {
        int strAB = Integer.parseInt("" + a + b);
        int strBA = Integer.parseInt("" + b + a);

        int result = strAB > strBA ? strAB : strBA ; 
        return result;
    }
}
