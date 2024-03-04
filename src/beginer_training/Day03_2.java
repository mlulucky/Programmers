package beginer_training;

import java.util.Arrays;

public class Day03_2 {
	public int solution(int[] array) {
		Arrays.sort(array);
		return array[(array.length-1)/2];
	}
}

// 중앙값 구하기
// 배열 오름차순 정렬하기
// 배열길이-1 : 인덱스
// 인덱스의 중앙은 ? : 2 로 나눈 인덱스
