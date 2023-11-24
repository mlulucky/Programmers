package basic_training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day20_3 {
	public int solution(String[] strArr) {
		int answer = 0;
		
		Map<Integer, List<String>> list = Arrays.stream(strArr).collect(Collectors.groupingBy(String::length));
		return list.values().stream().map(List::size).max(Integer::compareTo).orElse(0);
	}
}

// 문자열 길이에 따라 그룹화. 결과를 맵으로 반환
// 맵의 키는 문자열의 길이. 값은 해당 길이에 해당하는 문자열 리스트

// list.keySet().stream().max(Integer::compareTo).orElse(0); 
// map 형태의 list 의 key 값(배열의 길이) 중 가장 큰 값을 반환