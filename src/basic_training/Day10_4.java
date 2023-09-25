package basic_training;

public class Day10_4 {
		public String solution(String my_string, int m, int c) {
			StringBuilder sb = new StringBuilder();
			for(int i=c-1; i<my_string.length(); i += m) {
				sb.append(my_string.charAt(i));
			}
			return sb.toString();
		} 
}

// 자바 문자열 -> 배열(문자배열) 로 만들기
// char[] 변수명 = 문자열.toCharArray();

// 번외 문제풀이 _ 문자열 배열로 
// StringBuilder sb = new StringBuilder();
// 	int cIndex = c-1;
// 	char[] strArr = my_string.toCharArray();
// 	int repeatCount = strArr.length/m; 
// 	for(int i=0; i<repeatCount; i++) { // 반복횟수
// 		int targetIdx = i*m + cIndex; 
// 		sb.append(strArr[targetIdx]);
// 	}
// 	return sb.toString();

// 번외 문제풀이 _ IntStream
//  int cIndex = c - 1;
// 	return IntStream.range(0, my_string.length() / m) // IntStream.range(startIdx, lastIdx) : startIdx 부터 lastIdx 범위 까지, 범위에 대해 반복
// 			.mapToObj(i -> my_string.charAt(i * m + cIndex))
// 			.map(String::valueOf)
// 			.collect(Collectors.joining());