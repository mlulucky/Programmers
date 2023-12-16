function solution(picture, k) {
	let answer = [];
	for(let str of picture) {
		let repeatStr = str.split('').map((value) => value.repeat(k)).join('');
		answer.push(...Array(k).fill(repeatStr));
	}
	return answer;
}


// Array(k).fill(값)
// 값을 k번 반복하는 배열을 생성
// ... 스프레드 연산을 붙여서 배열의 모든 요소를 각각 push
// [].push([1,1,1]);
// => [[1,1,1]];
// [].push(...[1,1,1]);
// => [1,1,1];