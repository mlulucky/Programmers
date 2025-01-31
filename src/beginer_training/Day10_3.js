function solution(numbers, k) {
	const lastNum = numbers.length-1;
	let count = 1;
	let n = 0;
	while(true) {
			if(count === k) return numbers[n];
			n+=2;  
			if(n>lastNum) {
					n = n - lastNum -1;
			} 
			count++; 
	}
	
}

// 다른방법: 수식
// return numbers[((2 * (k - 1))) % numbers.length];