function solution(n) {
	let answer = [];
	for(let i=0; i<n; i++) {
		answer[i] = Array(n).fill(0);
		answer[i][i] = 1;
	}
	return answer;
}

// 참고할만한 번외 문제풀이
// const answer = new Array(n).fill().map((_, idx)=> {
// 	const arr = new Array(n).fill(0);
// 	arr[idx] = 1;
// 	return arr;
// });

// return answer;
