package basic_training;

import java.util.Arrays;

public class Day12_5 {
	public int[] solution(int[] arr, int[] query) {
		int[] answer = arr;
		for (int i = 0; i < query.length; i++) {
			int idx = query[i];
			answer = (i % 2 == 0) ? Arrays.copyOfRange(answer, 0, idx + 1) : Arrays.copyOfRange(answer, idx, answer.length);
		}
		return answer;
	}
}

// 처음으로 가장 헷갈렸던 부분은
// 반복문일때 배열을 누적하면서 수정할수있을까 ?
// 주어진 arr 배열 answer 변수가 참조하게 만든 후 (answer, arr 동일한 배열을 참조)
// 반복문 안에서 answer = answer배열을 복사. 즉 answer 에 answer 배열을 대입함으로써, 반복문에 따라 배열의 결과가 누적되어 적용되게 한다.

// 🤔처음에는 i 가 홀수일 때를 먼저 가정하고 else 부분으로 구현을 했는데 테스트는 통과지만 제출 채점시에는 일부 실패가 동반되었다.
// 풀이가 잘못된건지 몇시간을 찾아보다가 이 풀이방법은 포기하고 다른 방법으로 하려던중 i 가 짝수일때를 먼저 가정하니 갑자기 테스트 전부 통과가 되었다.

