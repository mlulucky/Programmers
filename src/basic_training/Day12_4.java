package basic_training;

import java.util.Arrays;

public class Day12_4 {
	public int[] solution(int[] arr){
		int startIndex = -1;
		int lastIndex = -1;

		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 2) {
				startIndex = (startIndex == -1) ? i : startIndex; // 첫번째 2일때 
				lastIndex = i; // 두번째 2일때
			} 
		}
		
		if(startIndex == lastIndex && startIndex != -1) {
			return Arrays.copyOfRange(arr, startIndex, startIndex + 1);
		}
	 	else if(startIndex != -1 && lastIndex != -1) {
			return Arrays.copyOfRange(arr, startIndex, lastIndex+1);
		} 
		else {
			return new int[]{-1};
	}
}
}


// 문제풀이
// 요소가 있을때 == !=-1 -1 이 아니다.
// startIndex, lastIndex 가 동일할때 => 요소가 하나. 해당 요소를 반환하는 배열
// startIndex, lastIndex 가 다를때 => 요소가 2개, 인덱스범위로 배열을 반환
// startIndex 가 없을때 => 요소가 없음. -1 반환

// 참고할만한 번외 문제풀이 _ IntStream
// int[] idx = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray(); // arr[i] == 2 인 i 만 배열요소로 남기기
// if(idx.length == 0) return new int[]{-1};
// return IntStream.rangeClosed(idx[0], idx[idx.length-1]).map(i -> arr[i]).toArray(); // 배열 arr 에서 해당 인덱스의 값을 가져와 스트림으로 매핑 -> 매핑된 값을 정수배열로 반환

// 번외 문제풀이 _ List 에 arr 배열의 인덱스를 저장
// List<Integer> result = new ArrayList<>();	
// for(int i=0; i<arr.length; i++) {
// 	if(arr[i] == 2) {
// 		result.add(i);
// 	}
// }
// if(result.size() == 1) {
// 	int[] answer = {arr[result.get(0)]};
// 	return answer;
// }
// else if(result.size() >= 2) {
// 	int[] answer = Arrays.copyOfRange(arr, result.get(0), result.get(result.size()-1)+1);
// 	return answer;
// }
// else {
// 	return new int[]{-1};
// }