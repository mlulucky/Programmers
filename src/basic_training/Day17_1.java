package basic_training;

public class Day17_1 {
	public String solution(String myString, String pat) {
		int idx = myString.lastIndexOf(pat);
		return myString.substring(0, idx + pat.length());
	}
}

// 참고할만한 번외 문제풀이
// int idx = myString.lastIndexOf(pat);
// return myString.substring(0, idx) + pat;

// substring(0, idx + pat.length()) 길이만큼 자르는 것 외에
// idx 까지 자르고, pat 문자열을 추가로 더하는 방법