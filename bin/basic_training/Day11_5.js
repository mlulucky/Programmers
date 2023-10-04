function solution(arr, idx) {
	// arr 배열 순회, 요소값이 1일때, 인덱스가 idx 보다 크거나 같으면 인덱스를 반환. 그렇지 않으면 -1
	let resultIndex = arr.findIndex((value, i) => value === 1 && i >= idx);
	return resultIndex !== -1 ? resultIndex : -1;
}

// 자바스크립트 배열 인덱스 찾기
// 배열.findIndex((value, index) => 조건식) : 조건식을 만족하는 첫번째 인덱스를 반환, 만족하는 값이 없는 경우 -1 반환 
// 배열.indexOf(찾을요소, from 인덱스) : from 인덱스 부터 찾을 요소에 해당하는 인덱스를 반환

// 🍉 참고할 만한 번외 문제풀이
// const solution = (arr, idx) => arr.indexOf(1, idx);