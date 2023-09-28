package basic_training;

public class Day11_1 {
	public int[] solution(String my_string) {
		int[] arr = new int[52]; // 0 ~ 25 인덱스 대문자 / 26 ~ 51 인덱스 소문자
		
		my_string.chars()
						 .forEach(c -> {
							int index = Character.isUpperCase(c) ? (c - 'A') : (c - 'a' + 26);
							arr[index]++;
						 });

		return arr;
	}
}

// 자바 배열 생성시 => 배열의 각 요소는 기본값 0 으로 초기화
// int[] arr = new int[52] // 배열의 모든 요소는 0 으로 초기화

// 배열 요소 초기화 값
// 정수 배열 (int[], long[]) : 0
// 부동소수점 배열 (float[], double[]) : 0
// 불리언 배열(boolean[]) : false
// 객체 배열(Object[]) : null

// 🔥 [문자 - 기준문자] : 기준문자로 부터의 거리 
// ex) ['A' - 'A'] == [0] // 문자 'A' 는 기준문자 'A' 로부터의 거리 0
// ex) ['C' - 'A'] == [2] // 문자 'C' 는 기준문자 'A' 로부터의 거리 2 

// 자바 문자열 => 문자 배열
// 문자열.toCharArray()

// 자바 향상된 for문
// for(문자 : 문자배열)

// 자바 문자 _ 대소문자 구별
// Character.isUpperCase(문자) : 문자가 대문자 인지
// Character.isLowerCase(문자) : 문자가 소문자 인지

// 🍉 번외 문제풀이 _ 람다식 & if문
// my_string.chars()
// 	.forEach(c -> {
// 	if(c >= 'A' && c <= 'Z') {
// 		arr[c - 'A']++; // 1 씩 증가 
// 	}
// 	if(c>='a' && c<= 'z') {
// 		arr[c - 'a' + 26]++; // 26인덱스 부터 1씩 증가 
// 	}	
// 	});

// 🍉 참고할 만한 번외 문제풀이
// int[] alphabetCount = new int[52]; // 대소문자 알파벳을 저장할 배열
// for (char c : my_string.toCharArray()) {
// 	if (c >= 'A' && c <= 'Z') {
// 		// 대문자 알파벳인 경우
// 		alphabetCount[c - 'A']++; // 해당 알파벳의 인덱스에 1 추가
// 	} else if (c >= 'a' && c <= 'z') {
// 		// 소문자 알파벳인 경우
// 		alphabetCount[c - 'a' + 26]++; // 해당 알파벳의 인덱스에 1 추가
// 	}
// }
// return alphabetCount;

// 🍉 참고할 만한 번외 문제풀이 _ 삼항 연산자
//  int[] answer = new int[52];
// 	for (char ch : my_string.toCharArray()) {
// 		int idx = Character.isUpperCase(ch) ? (ch - 'A') : (ch - 'a' + 26);
// 		answer[idx]++;
// 	}
// 	return answer;