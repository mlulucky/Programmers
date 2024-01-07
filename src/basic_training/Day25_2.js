function solution(arr) {
	let answer = arr.some((item, i) => item.some((_, j) => arr[i][j] !== arr[j][i]));
	return answer ? 0 : 1;
}