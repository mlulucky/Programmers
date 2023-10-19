package basic_training;

import java.util.ArrayList;

public class Day14_3 {
	public String[] solution(String[] todo_list, boolean[] finished) {
		ArrayList<String> result = new ArrayList<>();
		for(int i=0; i<finished.length; i++) {
			if(!finished[i]) {
				result.add(todo_list[i]);
			}
		}
		return result.toArray(new String[0]);
	}
}

// 문제풀이 _ for 반복문 (확실히 빠름 0.02ms)

// 번외 문제풀이 _ IntStream (4ms)
// return IntStream.range(0, finished.length).filter(i -> finished[i] == false).mapToObj(i -> todo_list[i]).toArray(size -> new String[size]);