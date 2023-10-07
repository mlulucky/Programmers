package basic_training;

public class Day12_2 {
	public int solution(int[] num_list) {
		int count = 0;
		for (int num : num_list) {
			if (num < 0) {
				return count;
			}
			count++;
		}
		return -1;
	}
}

// 번외 문제풀이 _ IntStream
// return IntStream.range(0, num_list.length).filter(i -> num_list[i] < 0).findFirst().orElse(-1);