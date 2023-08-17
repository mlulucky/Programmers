package basic_training;

public class Day06_2 {
    public int solution(int n, String control) {
        // control = "wsda" 로 이루어짐

        for(char ch : control.toCharArray()) {
            switch(ch) {
                case 'w' : n += 1; break;
                case 's' : n -= 1; break;
                case 'd' : n += 10; break;
                case 'a' : n -= 10; break;
            }
        }

        return n;
    }
}
