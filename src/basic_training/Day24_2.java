package basic_training;

import java.util.ArrayList;
import java.util.List;

public class Day24_2 {
	public String[] solution(String[] picture, int k) {
		List<String> answer = new ArrayList<>();

		for (String str : picture) { // str = "x.x"
			StringBuilder sb = new StringBuilder(); // 문자열추가

			for (char c : str.toCharArray()) { // str = ["x",".","x"]
				for (int i = 0; i < k; i++) {
					sb.append(c);
				}
			}
			for (int i = 0; i < k; i++) {
				answer.add(sb.toString());
			}
		}
		return answer.toArray(String[]::new);
	}
}

// arr = [x.x.x, xx.]
// k = 2
// => arr = [x.x.x, x.x.x, xx., xx.]
// => arr = [xx..xx..xx.., xx..xx..xx.., xxxx.., xxxx..]
// 처음 배열의 요소의 원소를 먼저 2배 화 시키고, 그 요소를 2배로 담기

// arr = [[],[],[]] => arr[0] 배열 * k / arr[0] 배열 요소 * k

// 자바 문자열 => 문자 배열 만드는 법
// 문자열.toCharArray();

// toArray() 는 Object[] 반환타입
// 반환타입 String[] 타입으로 알려주려기 => toArray(new String[])
// toArray(String[]::new) 와 동일한 역할

// String[]::new 는 String 배열 생성자 참조
// 배열의 크기와 동일한 String 배열을 만들고, 요소를 복사