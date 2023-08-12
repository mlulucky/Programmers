package basic_training;

public class Day05_1 {
    public String solution(String code) {
        int mode = 0;
        StringBuilder sb = new StringBuilder();
      
        char[] codeChar = code.toCharArray();

        for(int idx=0; idx < codeChar.length; idx++) {
            if(codeChar[idx] == '1') mode = 1 - mode;
            else {
                if(mode == 0 && idx % 2 == 0 || mode == 1 && idx % 2 == 1)
                    sb.append(codeChar[idx]);
            }
        }
        String ret = sb.toString().isEmpty() ? "EMPTY" : sb.toString();
        return ret;
    }
}