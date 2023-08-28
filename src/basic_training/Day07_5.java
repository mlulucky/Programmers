package basic_training;

import java.util.ArrayList;
import java.util.List;

public class Day07_5 {
	public int[] solution(int[] arr) {
		List<Integer> stk = new ArrayList<>();
		int i = 0;

		while(i<arr.length) {
			if(stk.isEmpty() || stk.get(stk.size()-1)<arr[i]) { // stk.get(stk.size()-1)<arr[i] 조건은 이미 !stk.isEmpty() 조건을 충족하고 있는 것
					stk.add(arr[i]);
					i++;
			} else {
					stk.remove(stk.size()-1);
			}
	}
	
		return stk.stream().mapToInt(Integer::intValue).toArray();
	}
}
