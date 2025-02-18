function solution(array, n) {
	let obj = array.reduce((acc, cur) => {
			
			let diff = Math.abs(cur-n);
			if(!acc[diff]) acc[diff] = []; 
			acc[diff].push(cur);
			
			return acc;
	}, {});
	
	let min = Math.min(...Object.keys(obj).map(Number));

	return Math.min(...obj[min])
		
}

// 다른방법: sort 이용
// array.sort((a,b) => Math.abs(n - a) - Math.abs(n - b) || a - b);
// sort 조건문 A || B
// || 연산자일때, 왼쪽 조건이 0 이되면 B 조건이 실행
// 절대값 차이가 동일할때 -> 오름차순으로 정렬