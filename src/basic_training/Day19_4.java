package basic_training;

import java.util.ArrayList;

public class Day19_4 {
	public int[] soluiton(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int num : arr) {
			if(list.isEmpty() || !list.get(list.size()).equals(num)) {
				list.add(num);
			}
			else {
				list.remove(list.lastIndexOf(num));
			}
		}
		return list.size() < 1 ? new int[]{-1} : list.stream().mapToInt(i->i).toArray();
	}
}

// list.add(value) : 특정 값(value) 을 추가
// list.remove(index) : 특정 index 요소를 제거
// list.remove(value) : 특정 값(value) 와 일치하는 첫번째 요소를 제거