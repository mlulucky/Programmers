package basic_training;

import java.util.ArrayList;
import java.util.Arrays;
public class Day19_5 {
	public int[] solution(int[] arr, int k) {
		int[] answer = Arrays.stream(arr).distinct().toArray();
		ArrayList<Integer> list = new ArrayList<>();

		for (int num : answer) {
			if (list.size() >= k) {
				break; // 반복문 종료
			}
			list.add(num);
		}
		while (list.size() < k) {
			list.add(-1);
		}
		return list.stream().mapToInt(i -> i).toArray();
	}
}

// 참고할만한 번외 문제풀이

// IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0,k).map(i -> -1)).limit(k).toArray();
// Arrays.stream(배열).distinct() : 배열의 중복요소 제외한 요소의 배열을 반환
// IntStream.range(0,k).map(i -> -1) : 0 부터 k 인덱스까지의 -1 요소를 가진 배열을 반환

// k 가 3이라면
// [0,1,2] + [-1,-1,-1,-1]
// [0,1,2,-1,-1,-1,-1] 에서 k 개수를 가진 스트림 
// => [0,1,2]

// k가 5라면
// [0,1,2,-1,-1]