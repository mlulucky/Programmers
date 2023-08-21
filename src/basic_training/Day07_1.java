package basic_training;

public class Day07_1 {
    public int[] solution(int[] arr, int[][] queries) {
        // queries = [[ ],[ ],[ ]] // queries[i] = [ s, e, k ]
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for(int i=s; i<=e; i++) {
                if(i%k == 0) arr[i] += 1;
            }
        }
        return arr;
    }
}
