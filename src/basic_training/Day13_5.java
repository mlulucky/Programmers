package basic_training;

public class Day13_5 {
	public int[] solution(int[] num_list, int n) {
		int count = num_list.length / n; // 배열길이를 정수로 나눈 몫
		int length = num_list.length % n == 0 ? count : count+1;
		int[] answer = new int[length];
		int idx = 0;
		for(int i=0; i<num_list.length; i*=n) {
		answer[idx++] = num_list[i];
		}
		return answer;
	}
}

// 문제풀이 _ for 반복문 (확실히 빠름 0.02ms)

// 번외문제풀이 _ InStream (IntStream 4ms) 
// return IntStream.range(0, num_list.length).filter(index -> index % n == 0).map(value -> num_list[value]).toArray();

// 자바 IntStream filter / map
// IntStream.range(시작인덱스, 마지막인덱스).filter(배열의인덱스 -> 조건식).map(배열의 요소(값) -> 조건식).toArray();
