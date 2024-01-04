package basic_training;

public class Day24_5 {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					answer[i][j] = 1;
			}
		}
		return answer;
	}
}

// 참고할 번외 문제풀이
// int[][] answer = new int[n][n];
// for(int i=0; i<n; i++) {
// 	answer[i][i] = 1;
// }
// return answer;