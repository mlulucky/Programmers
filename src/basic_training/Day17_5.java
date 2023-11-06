package basic_training;

import java.util.Arrays;

public class Day17_5 {
	public String[] solution(String my_string) {
		String[] answer = my_string.split(" "); // 공백 제거해야함
		return Arrays.stream(answer).filter(item -> !item.equals("")).toArray(String[]::new);
	}
}

// equals("") == isEmpty()

// 참고할만한 번외 문제풀이 _ trim(), split()
// return my_string.trim().split("\\s+");
// 문자열의 양끝 공백을 제거 및 하나이상의 공백문자를 기준으로 나눈 배열반환

// trim() : 문자열 양 끝의 공백을 제거
// \s 공백(정규표현식)
// \s+ 하나이상의 공백문자
