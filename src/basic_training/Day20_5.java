package basic_training;

import java.util.Arrays;

public class Day20_5 {
	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		return Arrays.copyOfRange(num_list,0,5);
	}
}

// 참고할만한 번외 문제풀이
// Arrays.stream(num_list).sorted().limit(5).toArray();