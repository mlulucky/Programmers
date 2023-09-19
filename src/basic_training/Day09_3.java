package basic_training;

public class Day09_3 {
	public String solution(String my_string, int n) {
		return my_string.substring(my_string.length() - n);
	}
}

// 자바 문자열 자르기
// 문자열.substring();
//사용법
// String.substring(start) //문자열  start위치부터 끝까지 문자열 자르기
// String.substring(start,end) //문자열  start위치 부터 end전까지 문자열 발췌		
// 1. 마지막 3글자 자르기
// String str = "ABCDEFG"; 
// String result = str.substring(str.length()-3, str.length());
// System.out.println(result)
// 결과값EFG
// 참조: https://byul91oh.tistory.com/309