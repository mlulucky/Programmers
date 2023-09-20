package basic_training;

import java.util.Arrays;

public class Day09_4 {
	public String[] solution(String my_String) {
		
		String[] answer = new String[my_String.length()];
		for(int i=0; i<my_String.length(); i++){
			answer[i] = my_String.substring(i);
		}
		Arrays.sort(answer);
		return answer;
	}
}

// 자바 배열 정렬 _ Object 타입 (String, Integer, Double)
// Arrays.sort(배열);

// 내림차순 정렬
// Arrays.sort(배열, Collections.reverseOrder());

// 기본타입인 int, double, char, float 등은 Wrapper 클래스로 박싱해주어야 정렬 가능
// 예) int[] -> Integer[]

