package basic_training;

import java.util.Arrays;

public class Day13_1 {
	public int[] solution(int[] num_list, int n) {
		return Arrays.copyOfRange(num_list, n-1, num_list.length);
	}
}
