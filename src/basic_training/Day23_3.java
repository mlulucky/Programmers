package basic_training;

import java.util.Arrays;

public class Day23_3 {
	public int solution(int[] num_list, int n) {
		return Arrays.stream(num_list).anyMatch(item -> item == n) ? 1 : 0;
	}
}
