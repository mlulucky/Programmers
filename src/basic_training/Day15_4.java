package basic_training;

import java.util.Arrays;

public class Day15_4 {
	public int solution(int[] num_list) {
		int initValue = num_list.length >= 11 ? 0 : 1;
		return Arrays.stream(num_list).reduce(initValue, (pre, cur) -> num_list.length>=11 ? pre + cur : pre * cur);
	}
	
}

// initValue 연산 초기값
// Stream.reduce 메서드는 Optional 객체 반환 (Optional 은 값이 없을때 null 반환)
// 보통 Optional.get 메서드나 Optional.orElse 메서드를 사용하여 Optional에서 값을 추출해야 한다.
// 다만 현재는 객체가 아닌 스트림의 원소를 처리하는 로직이므로. reduce 메서드에 초기값을 제공하면 Optional 이 아닌 해당 타입의 결과를 바로 얻을 수 있다.