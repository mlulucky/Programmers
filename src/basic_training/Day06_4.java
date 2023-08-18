package basic_training;

public class Day06_4 {
    public int[] solution(int[] arr, int[][] queries) {
        // queries = [[ , ], [ , ], [ , ]]
        for(int[] arr2 : queries) {
            int i = arr2[0];
            int j = arr2[1];

            int tmp = arr[i]; // 배열 요소 임시저장
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
}
