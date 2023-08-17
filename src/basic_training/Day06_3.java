package basic_training;

public class Day06_3 {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<numLog.length; i++) {
            switch(numLog[i] - numLog[i-1]) { // 현재 요소와 이전요소의 차이
                case 1 : sb.append("w"); break;
                case -1 : sb.append("s"); break;
                case 10 : sb.append("d"); break;
                case -10 : sb.append("a"); break;
            }
        } 
        
        return sb.toString();
    }
}
