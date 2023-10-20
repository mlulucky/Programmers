package basic_training;

public class Day14_4 {
	public int solution(int[] numbers, int n) {
		int sum = 0;
		for(int i=0; sum<=n; i++) {
				sum += numbers[i];
		}
		return sum;
	}
}

// 참고할만한 번외 문제풀이
// Arrays.stream(배열).reduce(스트림초기값설정, (최초.누적값, 현재값) -> 계산식)
// 배열을 스트림으로 변환. 스트림의 요소를 모두 더하여 결과계산
// return Arrays.stream(numbers).reduce(0,(pre, cur) -> pre<=n ? pre + cur : pre);

// for 반복문 _ length 이용
// int sum = 0;
// for(int i=0; i<numbers.length; i++) {
// 	if(sum < n) {
// 		sum += numbers[i];
// 	}	
// }
// return sum;