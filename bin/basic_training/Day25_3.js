function solution(arr) {
	const row = arr.length;
	const col = arr[0].length;
	const max = Math.max(row, col);
	let result = Array(max).fill().map(()=> Array(max).fill(0)); 
	for(let i=0; i<arr.length; i++) {
		result[i].splice(0, col, ...arr[i].slice(0, col));
	}
	return result;
}

// 참고할만한 번외 문제풀이
// 최대값 max
// for(let array of arr) { // array.length == col
// 	while(array.length < max) array.push(0); // col < row
// }
// while(arr.length < max) { // row < col
// 	arr.push(Array(max).fill(0));
// }
// return arr;