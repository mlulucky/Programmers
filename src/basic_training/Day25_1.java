package basic_training;

public class Day25_1 {
	public int[][] solution(int n) {
		int[][] arr = new int[n][n];
		int count = 1;
		int start = 0;
		int end = n - 1;

		while(start<=end) {
			for (int i = start; i <= end; i++) {
				arr[start][i] = count++;
			}
			for (int i = start + 1; i <= end; i++) {
				arr[i][end] = count++;
			}
			for (int i = end - 1; i >= start; i--) {
				arr[end][i] = count++;
			}
			for (int i = end - 1; i > start; i--) {
				arr[i][start] = count++;
			}
			start++;
			end--;
		}

		return arr;
	}
}
