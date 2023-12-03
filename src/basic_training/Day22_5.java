package basic_training;

public class Day22_5 {
	public int solution(String my_string, String target) {
		return my_string.indexOf(target) == -1 ? 0 : 1;
	}
}

// 번외 문제풀이
// return my_string.contains(target) ? 1 : 0;