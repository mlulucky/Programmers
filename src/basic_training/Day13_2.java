package basic_training;

public class Day13_2 {
	public static int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		int count = 0;
		for (int i = n; i < num_list.length; i++) {
			answer[count++] = num_list[i];
		}
		for (int i = 0; i < n; i++) {
			answer[count++] = num_list[i];
		}
		return answer;
	}
}

// 배열 자르기
// 참고할 만한 번외 문제풀이
// return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
// 이렇게 깔끔할수가..
// 이 식의 경우에는 배열의 요소 인덱스가 인덱스와 n 을 더한값을 배열의 길이로 나눈 나머지가 인덱스가 된다는 개념을 알고있어야 가능한거같다.
// 예) 배열의 인덱스 0,1,2,3,4 , n 이 3인 경우 n 을 기준으로 배열의 인덱스가 3,4,0,1,2 로 된다.

// 참고할 만한 번외 문제풀이 _ IntStream.range().map().toArray() : 자바 배열 복사
// int[] part1 = IntStream.range(n, num_list.length).map(i -> num_list[i]).toArray();
// int[] part2 = IntStream.range(0, n).map(i -> num_list[i]).toArray();
// return IntStream.concat(IntStream.of(part1), IntStream.of(part2)).toArray();

// 참고할 만한 번외 문제풀이 _ System.arraycopy() : 자바 배열 복사
// int[] answer = new int[num_list.length];
// int count = 0;

// // n번째 이후의 원소들을 answer 배열에 복사
// System.arraycopy(num_list, n, answer, count, num_list.length - n);
// count += num_list.length - n;

// // n번째까지의 원소들을 answer 배열에 복사
// System.arraycopy(num_list, 0, answer, count, n);

// return answer;