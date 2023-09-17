function solution(intStrs, k, s, l) {
	let answer = intStrs.map(str => Number(str.substring(s,s+l))).filter(i => i>k);
	return answer;
}

// 다른사람 풀이중 배울만한 풀이 _ 배열.reduce() 이용
// const solution = (strs, k, s, l) => strs.reduce(
//     (acc, cur) => (
//         Number(cur.substring(s, s + l)) > k
//         ? [...acc, Number(cur.substring(s, s + l))]
//         : acc
//     ),
//     [],
// )

// 자바스크립트 문자열 자르기
// 문자열.substring(시작위치, 종료위치) : 종료위치 -1 까지 문자열을 자른다.

// 자바스크립트 문자열 정수로 변환
// Number()
// parseInt()

// 배열.map() : 배열의 각 요소를 변환하여 새로운 배열 반환

// 배열.reduce() : 배열의 모든 요소를 하나의 값으로 축소
// 배열의 각 요소를 누적된 값으로 계산을 반환

// 1. sum = 배열.reduce((acc, cur) => acc + cur) // acc += cur 반복
// acc : 누적되는 값. 최종 출력되는 값
// cur : 현재 요소

// 2. sum = 배열.reduce((acc, cur) => acc + cur, 0)
// 0 : acc 의 초기값 (indx 0 == 0) 

// 3. 배열.reduce((acc, cur, index, arr) => {}, 0)
// index : 배열 요소의 순서
// arr : 현재 배열
// 0 : acc 의 초기값 