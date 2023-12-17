package basic_training;

public class Day24_3 {
	public int[] solution(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (k % 2 == 0) ? arr[i] + k : arr[i] * k;
		}
		return arr;
	}
}

// 번외 문제풀이
// return Arrays.stream(arr).map(value -> (k%2== 0) ? value + 2 : value * k).toArray();
