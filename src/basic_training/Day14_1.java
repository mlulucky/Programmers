package basic_training;

public class Day14_1 {
	public int solution(int[] num_list) {
		int oddSum = 0;
		int evenSum = 0;		
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				oddSum += num_list[i];
			}
			else {
				evenSum += num_list[i];
			}
		}
		return Math.max(oddSum, evenSum);
	}
}


// Math.max(값1, 값2)
// 값1, 값2 중 큰 값을 반환. 값이 같은 경우에는 해당 값을 반환 