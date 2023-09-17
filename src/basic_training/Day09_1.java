package basic_training;

import java.util.Arrays;

public class Day09_1 {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		int[] answer = new int[intStrs.length];
		int idx = 0;
		for(String str : intStrs) {
			String sliceStr = str.substring(s, s+l);
			int strNum = Integer.parseInt(sliceStr);
			if(strNum > k) {
				answer[idx++] = strNum; // 조건에 맞을때만 idx 추가
			}
		}
		return Arrays.copyOf(answer, idx);  // 지정한 배열을 인덱스 0부터 idx 길이만큼 복사
	}
}


// 🌼 번외 문제풀이 _ ArrayList, List 이용
// List<Integer> answer = new ArrayList<>();

// for(String str : intStrs) {
// 	String sliceStr = str.substring(s, s+l);
// 	int strNum = Integer.parseInt(sliceStr);
// 	if(strNum > k) {
// 		answer.add(strNum);
// 	}
// }

// int[] arr = answer.stream().mapToInt(Integer::intValue).toArray(); // 👀 ArrayList -> int 배열로 변환하는 법
// return arr;

// 🌼 번외 문제풀이 _ Stream.of() 이용 : 다양한 데이터 유형을 스트림으로 변환
// return Stream.of(intStrs).mapToInt(str -> Integer.parseInt(str.substring(s,s+l))).filter(i -> i>k).toArray();

// 🌼 번외 문제풀이 _ Arrays.stream() 이용 : 배열을 스트림으로 변환
// return Arrays.stream(intStrs).mapToInt(str -> Integer.parseInt(str.substring(s,s+l))).filter(i -> i>k).toArray();