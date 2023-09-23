package basic_training;

public class Day10_3 {
	public String solution(String my_string, int s, int e) {
		
		String originStr = my_string.substring(s,e+1);
		String reversedStr = new StringBuffer(originStr).reverse().toString();
		return my_string.replace(originStr, reversedStr);
	
	}
}

// 자바 문자열 뒤집기
// 문자열.substring(a,b) : 문자열 인덱스 a 부터 b-1 까지의 문자
// 문자열.replace("a","b") : 값 a 를 b 로 변경

// 번외 문제풀이
// return myString.substring(0, s) + new StringBuilder(myString.substring(s, e + 1)).reverse().toString() + myString.substring(e + 1);
