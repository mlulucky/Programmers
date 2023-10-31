package basic_training;

public class Day16_4 {
	public String solution(String str) {
		str = str.toLowerCase();
		str = str.replace("a","A");
		return str;
	}
}

// 번외문제풀이
// return str.toLowerCase().replaceAll("a","A");

// 문자가 a -> A 대문자 변환
// A 가 아닌 대문자 -> 소문자 변환
// => 문자열 전체 소문자로 변환 후 a 문자는 A 대문자로 변환하기

// 문자열은 불변객체
// 문자열.replace -> 문자열을 직접 수정하지 않는다.
// Character.toLowerCase -> 문자를 대문자로 값을 반환하거나 원본문자열을 수정하지 않는다.
// => 문자열에 수정된 문자열을 다시 대입해줘야 한다.
