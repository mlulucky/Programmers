package basic_training;

import java.util.Arrays;

public class Day20_2 {
	public int solution(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return arr1.length - arr2.length > 0 ? 1 : -1;
		}
		else {
			int arr1Sum = Arrays.stream(arr1).sum();
			int arr2Sum = Arrays.stream(arr2).sum();
			return arr1Sum - arr2Sum > 0 ? 1 : arr1Sum - arr2Sum < 0 ? -1 : 0;
		}
	}
}

// 참고할만한 번외 문제풀이
// int answer = Integer.compare(arr1.length, arr2.length);
// if(answer == 0) {
// 	answer = Integer.compare(InStream.of(arr1).sum(), InStream.of(arr2).sum());
// }
// return answer;

// Integer.compare(x, y) : x, y  값을 비교 
// x < y -1 반환 
// x > y 1 반환 
// x == y 0 반환 

