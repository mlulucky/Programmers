package basic_training;

public class Day23_2 {
	public String solution(String[] str_list, String ex) {
		StringBuilder sb = new StringBuilder();
		for(String val : str_list) {
			if(!val.contains(ex)) sb.append(val);
		}
		return sb.toString();
	}
}

// StringBuilder는 가변적인 크기의 문자열을 생성하고 조작할 수 있는 기능

// 번외 문제풀이
// return Arrays.stream(str_list).filter(item -> !item.contains(ex)).collect(Collectors.joining());
// collect(Collectors.joining())를 사용하여 필터링된 스트림의 요소를 문자열로 결합