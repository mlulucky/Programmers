function solution(n) {
	return Array.from({length: n}, (_, i) => i + 1).filter(item => item%2 !== 0); 
}

// Array.from 배열 생성
// {length: n} : 길이가 n 인 배열과 유사한 객체
// (element, index) => ... 
// 길이가 n 인 배열을 만들고 배열의 요소를 1부터 시작하는 숫자로 채움

// for(let i=1; i<=n; i++) {
// 	if(i%2!=0) answer.push(i);
// }
// return answer;

// for(let i=1; i<=n; i+=2) answer.push(i);