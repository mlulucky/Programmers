function solution(n, k) {
	let arr = [];
	for(let i=0; i<Math.trunc(n/k); i++) {
		arr.push(k*i + k);
	}
	return arr;
}

// 자바스크립트 소수점 반올림, 올림, 내림
// ceil(올림), floor(내림), round(반올림), trunc
// Math.ceil(1.5) == 2 (1.5 를 올림해서 2 정수로)
// Math.floor(1.5) == 1 (1.5 를 내림해서 1 정수로)
// Math.round(1.5) == 2 (1.5 를 올림해서 2 정수로)

// Math.trunc() 
// 주어진 값이 양수이건 음수이건 상관없이 소수점 이하 우측부분을 제거하는 매우 단순한 동작
// Math.trunc(1.5) == 1
// Math.trunc(-0.123) == -0;
// Math.trunc(NaN) == NaN;

// 🍉 참고할 만한 번외 문제풀이
// const solution=(n,k)=>Array(~~(n/k)).fill(k).map((v,i)=>v*(i+1));

// 🍉 참고할 만한 번외 문제풀이
// var answer = [];
// for(let i = k ; i <= n; i+=k){
// 		answer.push(i)
// }
// return answer;
