function solution(n) {
	let arr = Array(n).fill().map(() => Array(n).fill(''));
	let count = 1;
	let start = 0;
	let end = n - 1;

	while (start <= end) {
		for (let i = start; i <= end; i++) {
			arr[start][i] = count++;
		}
		for (let i = start + 1; i <= end; i++) {
			arr[i][end] = count++;
		}
		for (let i = end - 1; i >= start; i--) {
			arr[end][i] = count++;
		}
		for (let i = end - 1; i > start; i--) {
			arr[i][start] = count++;
		}
		start++;
		end--;
	}
	return arr;
}