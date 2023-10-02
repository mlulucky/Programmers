function solution(start, end_num) {
	let answer = [];
	while(start>=end_num) {
		answer.push(start--);
	}
	return answer;	
}

// 자바스크립트 배열 기본값 : undefined

// 🍉 참고할 만한 번외 문제풀이
// 😃 화살표 함수 한줄 식 => { return } : 중괄호 return 문 생략가능
// const solution = (start, end) => { return Array(start-end+1).fill(start).map((v,i)=>v-i); }
// const solution = (start, end) => Array(start-end+1).fill(start).map((v,i)=>v-i);





















