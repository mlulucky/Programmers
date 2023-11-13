package basic_training;

import java.util.Arrays;

public class Day19_1 {
	public String[] solution(String myStr) {
		String[] result = Arrays.stream(myStr.split("[abc]")).filter(item -> !item.isEmpty()).toArray(String[]::new);
		return result.length == 0 ? new String[] {"EMPTY"} : result;
	}
}


// myStr.split("[abc]") // 정규표현식 // a 또는 b 또는 c 로 문자열을 나눈 배열을 반환