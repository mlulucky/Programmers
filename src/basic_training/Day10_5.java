package basic_training;

public class Day10_5 {
	public String solution(int q, int r, String code) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<code.length(); i++) {
			if(i%q == r) {
				sb.append(code.charAt(i));
			}
		}
		return sb.toString();
	}
}

// 자바 정수 값 비교
// A == B (원시타입)
// A.equals(B) (객체타입)
// A.intValue() == B.intValue() (객체타입 ->원시타입으로 바꿔서 비교)

// 번외 문제풀이 _ IntStream (시간이 더 걸린다.)
// IntStream.range(0, code.length()) // 문자열의 각 문자에 대한 인덱스를 나타냄
// 				 .filter(i -> i%q == r) // 조건식을 만족하는 인덱스만 남긴다.
// 				 .mapToObj(code::charAt) // 남은 인덱스를 사용하여 code 문자열에서 문자 추출 // 각 인덱스를 해당위치 문자로 변환 // code String 객체의 charAt 메서드 참조 // 객체::메서드 : 메서드참조 문법
// 				 .map(String::valueOf) // 문자를 문자열로 변환 // Stream<Character> 각 문자를 String 으로 변환
// 				 .collect(Collectors.joining()); // 문자열을 하나의 문자열로 결합 

