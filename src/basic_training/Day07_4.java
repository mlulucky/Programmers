package basic_training;

import java.util.ArrayList;
import java.util.List;

public class Day07_4 {
	public int[] solution(int n) {
		// arraylist -> int[] array 배열 변환 : arraylist.stream().mapToInt(i->i).toArray();
		// n 가 1이 될때까지 반복

		List<Integer> answer = new ArrayList<>();
		answer.add(n);

		while(n!=1) { // n = 1 이면 실행 x 
			n = n%2==0 ? n/=2 : n*3+1;
			answer.add(n);
		}

		return answer.stream().mapToInt(Integer::intValue).toArray(); // mapToInt(i->i) Integer 객체를 int 정수로
	}
}

// stream 이용한 방법 
// n 은 초기값, i 는 초기값을 n 으로 각 계산에 맞게 값을 변경해나간다.
// return Stream.iterate(n, i -> i >= 1, i -> i == 1 ? 0 : i % 2 == 0 ? i / 2 : 3 * i + 1).mapToInt(Integer::intValue).toArray();
