package basic_training;

public class Day15_5 {
	public int solution(String myString, String pat) {
		return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
	}
}

// 번외 문제풀이
// int index = myString.toLowerCase().indexOf(pat.toLowerCase());
// return index == -1 ? 0 : 1;

// 문자열.indexOf(특정문자) -> 문자열이 특정문자를 포함하면 해당 특정문자의 인덱스를 반환 || 포함하지 않으면 -1 을 반환 