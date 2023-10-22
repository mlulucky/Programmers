package basic_training;

public class Day14_5 {
	public int[] solution(int[] arr, int[][] queries) {
		for(int[] query : queries) {
			int startIdx = query[0];
			int endIdx = query[1];

			for(int i=startIdx; i<=endIdx; i++) {
				arr[i] += 1; 
			}
		}
		return arr;
	}
}

// 번외 문제풀이
// for(int i=0; i<queries.length; i++) {
// 	for(int j=queries[i][0]; j<=queries[i][1]; j++) {
// 		arr[j]++;
// 	}
// }
