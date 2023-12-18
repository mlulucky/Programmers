package basic_training;

public class Day24_4 {
	public String solution(String myString) {
		// 문자열에서 l 보다 앞서는 문자를 모두 I 로 바꾼 문자열을 반환
		StringBuilder sb = new StringBuilder();
		for(char c : myString.toCharArray()) {// 문자열 -> 문자배열
			c = ('l' > c ) ? 'l' : c;
			sb.append(c);
		}
		return sb.toString();
	}
}	
