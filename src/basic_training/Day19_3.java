package basic_training;

import java.util.ArrayList;
import java.util.Collections;

public class Day19_3 {
	public int[] solution(int[] arr, boolean[] flag) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (flag[i] == true) {
				list.addAll(Collections.nCopies(arr[i] * 2, arr[i]));
			} else {
				list.subList(list.size() - arr[i], list.size()).clear();
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}

// Collections.nCopies(arr[i]*2, arr[i])
// arr[i]*2 개수 만큼, arr[i] 요소를 복사한 배열

// list.subList(list.size()-arr[i], list.size()).clear()
// list 배열에서 list.size()-arr[i] 인덱스부터, list.size() 배열의 마지막인덱스까지의 배열을, 비우기

// 참고할만한 번외 문제풀이
// String answer = "";
// for (int i = 0; i < arr.length; i++) {
// 	if (flag[i]) {
// 		answer += String.valueOf(arr[i]).repeat(arr[i] * 2);
// 	} 
// 	else {
// 		answer = answer.substring(0, answer.length()-arr[i]);
// 	}
// }
// return Stream.of(answer.split("")).mapToInt(Integer::parseInt).toArray();

// String.valueOf(요소) : 요소를 문자열로 변환
// Stream.of(요소) : 요소를 스트림으로 변환. 스트림 메서드 사용가능