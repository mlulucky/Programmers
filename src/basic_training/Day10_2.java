package basic_training;

public class Day10_2 {
	public int solution(String my_string, String is_prefix) {
		int answer = 0;
		String str = "";
		for(int i=0; i<my_string.length(); i++){
			str = my_string.substring(0,i);
			answer = str.equals(is_prefix) ? 1 : 0;
			break;
		}
		return answer;
	}
}

// 문자열.indexOf(특정문자) : 특정문자가 문자열 앞에서부터 발견되는 인덱스 반환 // 찾지 못한 경우 -1 반환

// 번외 문제 풀이 _ 문자열.indexOf()
// return a = my_string.indexOf(is_prefix) == 0 ? 1: 0; // 0번째 인덱스부터 포함되는지(접두사인지) ? 1 : 0

// 번외 문제 풀이 _ 문자열.startsWith()
// if (my_string.startsWith(is_prefix)) return 1;