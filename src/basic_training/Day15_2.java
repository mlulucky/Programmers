package basic_training;

import java.util.Arrays;

public class Day15_2 {
	public int solution(int[] arr) {
		int[] answer = new int[arr.length]; 
		for (int i = 0; i < arr.length; i++) { 
			answer = Arrays.stream(arr).map(value -> { // 조건에 맞게 배열을 변환 및 배열에 저장
				if (value >= 50 && value % 2 == 0) value /= 2;
				else if (value < 50 && value % 2 == 1) value = value * 2 + 1;
				return value;
			}).toArray();

			if (Arrays.equals(answer, arr)) {
				return i;
			}
			arr = answer;
		}
		return -1;
	}}

// 🔥 참고할만한 번외 문제풀이 _ while문 , Arrays.copyOf, Arrays.equals
// 문제풀이의 90% 가 모두 while문 풀이법이었다.
// int count = 0;
// while(true) {
// 	int[] copied = Arrays.copyOf(arr, arr.length);
// 	for (int i = 0 ; i < copied.length ; i++) {
// 			if (copied[i] >= 50 && copied[i] % 2 == 0) {
// 					copied[i] /= 2;
// 			} else if (copied[i] < 50 && copied[i] % 2 == 1) {
// 					copied[i] = copied[i] * 2 + 1;
// 			}
// 	}
// 	if (Arrays.equals(arr, copied)) {
// 			return count;
// 	}
// 	arr = copied;
// 	count++;
// }
// 1. 주어진 배열을 깊은 복사 Arrays.copyOf 한 새로운 배열 생성
// 2. 새로운 배열을 조건에 맞게 변경
// 3. 새로운 배열과 주어진 배열이 동일한지 확인 -> 동일하면 카운트수 반환(종료)
// 4. 새로운 배열을 이전 배열에 저장 및 카운트수 1 증가