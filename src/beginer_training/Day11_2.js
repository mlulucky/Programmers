function solution(n) {
	const numbers = [];
	
	for(let i=1; i<=n; i++) {
			let count = 0;
			let c = i;
			while(c > 0) {
					if(i % c === 0) count++; 
					c--;
			}
			
			if(count >= 3) numbers.push(i);
	}
	
	return numbers.length;
}

// 다른방법: 배수를 구하는 방식으로 (= 약수 계산)
// const arr = Array(n+1).fill(0);
// for(let i=1; i<=n; i++) {
// 		for(let j=i; j<=n; j+=i) {
// 				arr[j]++;
// 		}
// }

// return arr.filter(value => value >= 3).length;