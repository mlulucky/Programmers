package basic_training;

public class Day04_4 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(ineq).append(eq);
        String calc = sb.toString();

        if( (calc.contains(">=") && n>=m) ||
            (calc.contains("<=") && n<=m) ||
            (calc.contains(">!") && n>m) ||
            (calc.contains("<!") && n<m) ) { answer=1; }

        return answer;
    }
}
