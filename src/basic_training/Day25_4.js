function solution(board, k) {
	let sum=0;
	board.forEach((item, i) => {
		const arr = item.filter((_, j) => i+j <= k);  
		sum += arr.reduce((acc, curr) => acc + curr, 0);
	})
	return sum;

}

// row.reduce((acc, curr) => acc + curr, 0); // acc 누적값, curr 현재 배열의 요소