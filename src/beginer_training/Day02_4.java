package beginer_training;

public class Day02_4 {
	public int[] solution(int[] numbers) {
		for(int i=0; i<numbers.length; i++) {
			numbers[i] *= 2;
		}
		return numbers;
	}
}

// 참고할만한 번외 문제풀이
// Arrays.stream(numbers).map((value) -> value*2).toArray();