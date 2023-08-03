package basic_training;

public class Day03_1 {
    public static String solution(String str1, String str2) {
        
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }

        answer = sb.toString();
        return answer;
    }
    
}
