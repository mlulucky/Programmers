package basic_training;

import java.util.Arrays;

public class Day13_3 {
	public String[] solution(String[] str_list) {
		int lIndex = Arrays.asList(str_list).indexOf("l");
		int rIndex = Arrays.asList(str_list).indexOf("r");

		if (rIndex != -1 && (lIndex == -1 || rIndex < lIndex)) { // "r"만 있거나 "r"이 "l"보다 먼저 나왔을 때
			return Arrays.copyOfRange(str_list, rIndex + 1, str_list.length);
		} else if (lIndex != -1 && lIndex > 0) { // "l"만 있거나 "l"이 "r"보다 먼저 나왔을 때
			return Arrays.copyOfRange(str_list, 0, lIndex);
		}
		return new String[0]; // 그외 모든 경우 ("r", "l" 둘다없는 경우 등)
	}
}

// 참고할만한 번외 문제풀이 _ for 반복문, 문자열.equals(), Arrays.copyOfRange();
// for (int i = 0; i < str_list.length; i++) {
	// if ("l".equals(str_list[i])) {
	// 	return Arrays.copyOfRange(str_list, 0, i);
	// } else if ("r".equals(str_list[i])) {
	// return Arrays.copyOfRange(str_list, i + 1, str_list.length);
	// }
// }
// return new String[0];
// 와.. 너무 깔끔하다
// 반복문으로 순회하면서 먼저 해당되는 케이스 if 조건문이 만족하면 먼저 인덱스로 배열을 반환하는 것.

// indexOf() : List 타입 또는. 문자열(배열x) 에서 사용