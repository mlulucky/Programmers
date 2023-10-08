function solution(arr, intervals) {
	return intervals.reduce((result, value)=>{ // result : 누적결과 , value : 배열의 각 요소
		let a = value[0];
		let b = value[1];
		return result.concat(arr.slice(a, b+1));
	}, []); // result 초기값 [] 빈배열
}

// js 2차배열 1차배열로
// 2차원배열.flat() => 1차원 배열
// 다만 flat() 함수는 속도가 느리다. spread 연산자와 concat() 연산자 사용하는 것을 더 추천

// js 자르기
// 문자열 자르기 _ 문자열.substring()
// 배열 || 문자열 자르기 _ 배열.slice()
// 배열 합치기
// let new배열3 = 배열.concat(배열2);
// new배열3 = 배열 + 배열2

// 번외 문제풀이 _ map().flat()
// return intervals.map((value, index) => {
// 	let a = value[0];
// 	let b = value[1];
// return arr.slice(a, b+1);
// }).flat();

// 🍉 참고할 만한 번외 문제풀이 _ 객체 구조분해 할당, spread연산자
// const [[a,b],[c,d]] = intervals;
// return [...arr.slice(a,b+1), ...arr.slice(c,d+1)];