package basic_training;

public class Day10_1 {
	public String solution(String my_string, int n) {
		return my_string.substring(0, n);
	}
}

// 문자열 , 정수 n
// 주어진 문자열 앞에서부터 정수 n 만큼 문자열을 return 
// 문자열.substring(시작인덱스, 마지막인덱스(포함x)) : 인덱스 범위의 문자열을 반환