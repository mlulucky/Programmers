package basic_training;

public class Day20_4 {
	public int[] solution(int[] arr, int n) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += arr.length%2 == 0 ? (arr[i]%2==0 ? 0 : n) : (arr[i]%2==0 ? n : 0);
		}
		return arr;
	}
}

// 삼항연산자
// 조건식 ? 조건식참이면 실행 : 조건식거짓이면 실행

// 번외 문제풀이
// return IntStream.range(0,arr.length).map(idx -> arr.length % 2 ==0 ? (idx % 2 == 1 ? arr[idx]+=n : arr[idx]) : (idx % 2 == 0 ? arr[idx]+=n : arr[idx])).toArray();