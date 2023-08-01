package basic_training;

public class Day02_5 {
    public String solution(String my_string, String overwrite_string, int s) {
        // 문자.substring(int beginidx, int endidx) : 문자 자르기 메서드 이용하는 방법도 있다!
        // substring 에 대해 알기 전에 풀어보았던 거라서 다소 복잡함이 있다.
        String answer = "";
        char[] overStr = overwrite_string.toCharArray();
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = s; i < overStr.length + s; i++) {
            sb.setCharAt(i, overStr[i - s]);
        }

        answer = sb.toString();

        return answer;
    }
}
