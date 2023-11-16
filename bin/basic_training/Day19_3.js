function solution(arr, flag) {
	let answer = [];
	let count = 0;
	arr.forEach((value, idx) => {
		if (flag[idx]) { // true
			while (count < value * 2) {
				answer.push(value);
				count++;
			}
		}
		else {
			answer.splice(-value)
		}
	})
	return answer;
}

// 참일때
// arr[i] 를 arr[i]*2 번 추가

// 참조할만한 번외 문제풀이
// arr.reduce((prev, num, i) =>
// (flag[i] ? [...prev, ...new Array(num * 2).fill(num)]
// 	: prev.slice(0, -num)
// ), [])

// prev : 최초값, 누적된 결과값
// num : 현재값
// i : 현재 인덱스

// prev.slice(0, -num) : prev 배열에서 마지막 num 개의 요소를 제외한 요소로 구성된 새 배열을 반환