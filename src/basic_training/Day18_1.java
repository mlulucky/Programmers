package basic_training;

import java.util.Arrays;

public class Day18_1 {
	public int[] solution(String myString) {
		String[] strArr = myString.split("x", -1); // 문자 x 를 기준으로 나눈 배열 
		return Arrays.stream(strArr).map(value -> value.length()).mapToInt(Integer::intValue).toArray();
	}
}

// split("x") "oxooxoxxox" ->  ["o","oo","o","","o"]
// split("x",-1) "oxooxoxxox" ->  ["o","oo","o","","o",""]

// x를 기준으로 나누었을때, 문자열의 끝에 위치한 빈문자열은 제거.
// split 에 -1 인자를 전달하면 문자열 끝에 생성된 빈문자열도 포함하여 결과를 반환


// 비슷한 번외문제풀이 - 문자열을 문자열의 길이로 바꾸는 방법 map(String::length)
// return Arrays.stream(myString.split("x", -1)).map(String::length).toArray(Integer[]::new);

// stream.toArray() => Object[] 배열을 반환 (int[] 배열 반환못함)
// int[] 배엷 반환하기위한 별도 로직필요
// -> stream.mapToInt(Integer::intValue).toArray()
// -> 스트림을 int 형태로 반환