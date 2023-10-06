function solution(n, slicer, num_list) {
	let [a,b,c] = slicer;
	let start = (n===1) ? 0 : a;
	let end = (n===2) ? num_list.length : b+1; 
	return result = (n===4) ? 
		num_list.slice(start, end).filter((value, index) => index % c === 0) : num_list.slice(start, end);
}

// 자바스크립트 배열.slice(시작인덱스, 마지막인덱스)
// 시작인덱스부터 마지막인덱스 -1 까지 배열을 반환 (원본배열변경 x _ 얕은복사)

// 🍏 번외 문제풀이 
// let start = (n===1) ? 0 : slicer[0];
// let end = (n===2) ? num_list.length-1 : slicer[1];
// let answer = [];
// for(let i=start; i<=end; i+=(n===4) ? slicer[2] : 1) {
// 	answer.push(num_list[i]);
// }	
// return answer;