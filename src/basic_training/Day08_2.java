package basic_training;

import java.util.Arrays;

public class Day08_2 {
	public int solution(int a, int b, int c, int d) {
		int score = 0;
		int[] values = { a, b, c, d };

		// 중복제거 배열
		int[] uniqueValues = Arrays.stream(values).distinct().toArray();
		if (uniqueValues.length == 1) { // 배열의 모든 요소가 같다.
			score = 1111 * uniqueValues[0];
		} 
		if (uniqueValues.length == 2) {
			int p = uniqueValues[0];
			int q = uniqueValues[1];
			int count1 = (int) Arrays.stream(values).filter(val -> val == p).count(); // 같은숫자가 p, 다른숫자 q
			int count2 = (int) Arrays.stream(values).filter(val -> val == q).count();
			if (count1 == 3) { // 배열의 세 요소가 같고, 나머지 하나는 다르다.
				score = (int) Math.pow((10 * p + q), 2);
			} 
			if (count2 == 3) {
				score = (int) Math.pow((10 * q + p), 2);
			} 
			if (count1 == 2 && count2 == 2) { // 배열의 두 요소가 같고, 나머지 두 요소도 같다.
				score = (p + q) * Math.abs(p - q); // |p-q| : 절대값 반환
			}
		} 
		if (uniqueValues.length == 3) { // 배열의 두 요소가 같고, 나머지 두 요소가 다르다.
			int p = uniqueValues[0]; // 같은값
			int q = uniqueValues[1];
			int r = uniqueValues[2];
			int count1 = (int) Arrays.stream(values).filter(val -> val == p).count();
			int count2 = (int) Arrays.stream(values).filter(val -> val == q).count();
			int count3 = (int) Arrays.stream(values).filter(val -> val == r).count();
			if (count1 == 2) {
				score = q * r;
			}
			if (count2 == 2) {
				score = p * r;
			}
			if (count3 == 2) {
				score = p * q;
			}
		} 
		if (uniqueValues.length == 4) { // 같은 값이 없습니다.
			Arrays.sort(values); // 오름차순
			score = values[0];
		}

		return score;
	}
}

// 이번 문제도 넘나 어려웠다... 
// 일단 나는 경우의 수로 조건으로 구하기보다는 저 4개의 인자를 배열로 보았고, 배열의 중복값 개수로 처리하는 방법을 생각했다. (하지만 어떻게 할 수 있을지 잘 떠오르지 않았다.)
// 2일 정도를 문제만 분석하다 못 풀고 3일 째에 내가 생각한 조건들로 chatgpt 에게 방법을 물어보아 틀을 만들 수 있었다. (결과적으로는 미통과였다.)
// 예제는 통과하였지만 제출 시 채점에서 테스트 실패가 나왔다. 
// 여기서부터는 온전히 내 몫이 었다. 일부분 추가적으로 조건을 더 주었고 여러번의 테스트 실패를 거쳐서 드디어! 통과가 되었다. (일부 테스트가 계속 미통과였다..)
// 통과는 너무 기뻤지만 코드는 썩 마음에 들지 않았다. 👀 변수의 중복이 거슬렸다. 
// 중복을 없애기 위해 드모르간의 법칙(길이가 1이 아닌 경우)를 하나의 조건으로 해서 변수를 선언하는등.. 해보았지만 런타임에러가 났다.. ^^
// 결국은 수정하지 못해 아쉽지만, 일단 나중에 아이디어가 떠오른다면 다시 리팩토링 해보고싶다.

// 배열의 중복값 제거시
// -> 모두 같은 값일때 배열의 길이는 1
// -> 3개가 값일때 배열의 길이는 2
// -> 2개, 2개가 같은 값일때 배열의 길이는 2
// -> 2개가 같은 값일때 배열의 길이는 3
// -> 같은 값이 없을때 배열의 길이는 4

// 👀 나중에 리팩토링해보기
