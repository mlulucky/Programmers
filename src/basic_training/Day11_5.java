package basic_training;

public class Day11_5 {
	public int solution(int[] arr, int idx) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1 && i >= idx) return i; // 함수 종료
		}
		return -1;
	}
}


// 🍉 참고할 만한 번외 문제풀이 _ IntStream (시간 오래걸림)
// IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
// 자바 배열.filter(배열 요소 -> )