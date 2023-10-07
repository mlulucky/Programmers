function solution(num_list) {
	return num_list.findIndex((value) => value < 0);
}

// 자바스크립트 배열.findIndex((value, index) => 조건식)
// 조건식을 만족하는 배열의 첫번째 요소에 대한 인덱스를 반환
// 만족하는 요소가 없으면 -1 을 반환 