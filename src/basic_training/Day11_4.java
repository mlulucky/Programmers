package basic_training;

public class Day11_4 {
	public int[] solution(int start, int end_num) {
		int length = start-end_num+1;
		int[] answer = new int[length];
		for(int i=0; i<answer.length; i++) {
			answer[i] = start-i;
		}
		
		return answer;
	}	
}

// 🍉 참고할 만한 번외 문제풀이
// return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();