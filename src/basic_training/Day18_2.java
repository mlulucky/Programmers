package basic_training;

import java.util.Arrays;

public class Day18_2 {
	public String[] solution(String myString) {
		return Arrays.stream(myString.split("x")).filter(item -> !item.isEmpty()).sorted().toArray(String[]::new);
	}
}


// String [] strArr = myString.split("x");
// Arrays.sort(strArr);
// return strArr;

// 자바 trim() : 문자열의 앞뒤공백을 제거

// Arrays.sort() 메서드는 배열을 정렬하지만 반환값은 없음.
// -> return Arrays.sort() 이렇게 바로 return 은 안됨
// -> String [] strArr = Arrays.sort(myString.split("x")); 반환값이 없으니까 이렇게 대입도 안됨.
// 정렬한 배열을을 만들어서 반환을 해야함.
