package basic_training;

import java.util.Arrays;

public class Day15_1 {
	public int[] solution(int[] arr) {
		return Arrays.stream(arr).map(value -> {
			if(value >= 50 && value % 2 == 0) value /=2;
			else if(value <50 && value % 2 == 1) value *= 2;
			return value;
		}).toArray();
	}
}

// 번외 문제풀이법 _ for 반복문 (제일빠름 0.02ms)
// for (int i = 0; i < arr.length; i++) {
// 	if (arr[i] >= 50 && arr[i] % 2 == 0) {
// 		arr[i] = arr[i] / 2;
// 	}
// 	if (arr[i] < 50 && arr[i] % 2 == 1) {
// 		arr[i] = arr[i] * 2;
// 	}
// }
// return arr;

// 번외 문제풀이법 _ IntStream.range().map() (2,3ms)
// IntStream.range(0, arr.length).map(index -> {
// if(arr[index] >= 50 && arr[index] % 2 == 0) {
// 	arr[index] /= 2;
// }
// else if(arr[index] < 50 && arr[index] % 2 == 1) {
// 	arr[index] *= 2;
// }
// return arr[index];
// }
// ).toArray();


// 🤔 새롭게 알게된 점
// IntStream.range(0, arr.length).map(value -> {}).toArray();
// 여기서 map 의 인자는 value 배열의 요소.값이 아니라 인덱스이다
// 왜? IntStream.range 로 배열의 인덱스 숫자 스트림이 생성이 되므로, 이후에 map 에서 처리되는 value 는 배열의 인덱스가 되어버린다.

// return 문이 사용된 위치에 따라 다르게 동작
// 1. 메소드(함수) 내에서 사용되는 경우 -> 함수를 종료 및 값 반환
// 2. 람다식 내에서 사용되는 경우 -> 스트림의 중간 연산의 결과를 반환

// 배열의 스트림 생성
// 배열의 스트림 생성이란? 배열의 각 요소를 순차적으로 처리할 수 있는 스트림 객체를 만든다
// 스트림은 '데이터의 흐름'. 배열에 저장된 데이터 하나씩 순차적으로 처리되는 과정 -> 필터링, 맵핑등 다양한 연산을 적용할 수 있다.
// Arrays.stream(arr)