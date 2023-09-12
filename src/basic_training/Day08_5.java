package basic_training;

public class Day08_5 {
	public String solution(String my_String, int[][] queries) {
		// queries = [[s,e],[,],[,]] // s - e 인덱스까지 문자열 인덱스를 뒤집기
		StringBuilder result = new StringBuilder(my_String);

		// 문자열을 인덱스기반으로 replace 변경하려면 String 클래스 replace 대신 StringBuilder 사용
		for(int[] query : queries) { // [2,3],[0,7]...
			int strtIdx = query[0];
			int lastIdx = query[1];
			String reverseString = reverseString(result.toString(), strtIdx, lastIdx+1);  // 변경된 String 에서 다시 문자열 뒤집기 // 변경된 String 은 result.toString()
			result.replace(strtIdx, lastIdx+1, reverseString); // result 의 strtIdx 부터 lastIdx 포함한 인덱스까지 reverseString 으로 대체
		}
		return result.toString(); 											
	}

	private String reverseString(String myString, int strtIdx, int lastIdx) {
			String subStringReverse = myString.substring(strtIdx, lastIdx);
			StringBuilder sb = new StringBuilder(subStringReverse);
			sb.reverse();
			return sb.toString();
		}
}
