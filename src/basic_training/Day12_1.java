package basic_training;

import java.util.ArrayList;
import java.util.List;

public class Day12_1 {
	public int[] solution(int n, int[] slicer, int[] num_list) {
		List<Integer> listArr = new ArrayList<>();

		int start = slicer[0];
		int end = slicer[1];
	
		switch(n) {
			case 1: 
				start = 0;
				break;
			case 2:
				end = num_list.length-1;
				break;
		}

		for(int i=start; i<=end; i+= (n == 4) ? slicer[2] : 1) {
			listArr.add(num_list[i]);
		}

		return listArr.stream().mapToInt(Integer::intValue).toArray();  
	}
}


// List Integer 배열 int 배열로 변환
// int[] result = listArr.stream().mapToInt(Integer::intValue).toArray();