package basic_training;

import java.util.Arrays;

public class Day13_4 {
	public int[] solution(int[] num_list, int n) {
		return Arrays.copyOfRange(num_list, 0, n);
	}
}

// 번외문제풀이 _ InStream (Arrays 0.04ms / IntStream 4ms) 
// IntStream.range(0, n).map(i -> num_list[i]).toArray();

// 번외문제풀이 _ for 반복문 (확실히 제일빠름 0.02ms)
// int[] answer = new int[n];
// for(int i=0; i<n; i++) {
// 	answer[i] = num_list[i];
// }
// return answer;