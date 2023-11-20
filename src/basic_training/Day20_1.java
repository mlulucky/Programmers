package basic_training;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Day20_1 {
	public int[] solution(int[] arr) {
		int a = arr.length;
		int powerN = (int) Math.ceil(Math.log(a)/Math.log(2));
		int square = (int) Math.pow(2,powerN);
		return IntStream.concat(Arrays.stream(arr), IntStream.range(0, square).map(i-> 0)).limit(square).toArray();
	}

}

// Math.log(a)/Math.log(2) : 2 의 몇승이 a 보다 큰지. 첫번째 정수 계산


// 참고할만한 번외 문제풀이
// int length = 1;
// while(length < arr.length) {
// 	length *= 2;
// }
// return Arrays.copyOf(arr, length);

