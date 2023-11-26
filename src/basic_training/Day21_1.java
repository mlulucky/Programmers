package basic_training;

import java.util.Arrays;

public class Day21_1 {
	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		return Arrays.copyOfRange(num_list, 5, num_list.length);
	}
}

// 참고할만한 번외 문제풀이
// return Arrays.stream(num_list).sorted().skip(5).toArray();
// 오름차순 정렬후 정렬된 스트림의 앞에서 5개 요소를 건너뛴(skip) 후 스트림을 다시 배열로 반환(toArray())