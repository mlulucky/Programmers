package basic_training;

public class Day11_2 {
	public int[] solution(int n, int k){
		int arrayLength = n/k;
		int[] answer = new int[arrayLength];
		for(int i=0; i<arrayLength; i++) {
			answer[i] = k*i + k;
		}
		return answer;
	}
}

// IntStream.range(0, 5)
// 0 부터 4까지의 정수 스트림 생성
// => 0,1,2,3,4 // i 는 0,1,2,3,4

// 🍉 번외 문제풀이 _ IntStream (시간 더 걸린다.)
// return IntStream.range(0, n/k) // 범위 0 부터 n/k -1 범위까지 정수 스트림
// 					.map(i -> k * i + k)
// 					.toArray();


