package basic_training;

import java.util.stream.IntStream;

public class Day22_4 {
	public int[] solution(int[] arr, int[] delete_list) {
		// delete_list 요소가 있는 경우 / 없는 경우 -> 그대로 반환		
		for(int i=0; i<delete_list.length; i++) {
				int deleteVal = delete_list[i];
				arr = IntStream.of(arr).filter(item -> item != deleteVal).toArray();
		}
		return arr;
	}
}

// 참고할만한 번외 문제풀이
// return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();

// 에러 _ 람다식에서는 변경되는 i 를 참조할 수 없다 -> delete_list[i] 에러
// IntStream.of(arr).anyMatch(item -> item == delete_list[i]);
// 람다 표현식 내에서 delete_list[i]와 같은 비종결적(non-final) 로컬 변수를 참조하려고 시도하여 발생한 것입니다. 
// 이 문제를 해결하기 위해 변수의 복사본(int toDelete = delete_list[i];) 을 만들고 그것을 람다 표현식 내에서 사용하면 됩니다.