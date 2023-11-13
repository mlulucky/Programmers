package basic_training;

import java.util.ArrayList;

public class Day19_2 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]; j++) {
				list.add(arr[i]);
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}
}

// .mapToInt(i -> i) : Integer 객체를 int 값으로 변환