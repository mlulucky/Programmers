package basic_training;

public class Day09_5 {
	public int solution(String my_string, String is_suffix) {
		int answer = 0;
		String result ="";
		for(int i=0; i<my_string.length(); i++){
			result = my_string.substring(i);
			if(result.equals(is_suffix)) { 
				answer = 1;
				return answer;
			}
		}
		return answer;
	}
}

// 문제 풀이
// 문자열의 인덱스만큼 반복적으로, 문자열을 자른다 
// 문자열이 is_suffix 와 같은지 filter 비교하여, 같으면 1을 반환, 다르면 0 을 반환한다.

// 🌼 번외 문제풀이 _ endsWith 라는 String 메서드가 있었음
// 문자열.endsWith(특정문자열) : 문자열이 특정 문자열로 끝나는지 체크하는 함수 => boolean 타입을 반환 (true / false) 

// if(my_string.endsWith(is_suffix)){
// 	return 1;
// }
// else {
// 	return 0;
// }