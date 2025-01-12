function solution(num_list) {
	const numCount = num_list.length;
	let odd = 0;
	for(let i=0; i<numCount; i++) {
			if(num_list[i] % 2 !=0) odd++;
	}
	
	return [numCount - odd, odd];
}

// arr[num%2] += 1; 방법도 있음
// 어차피 짝수, 홀수의 2로 나눈 나머지는 0(짝수 나머지) 아니면 1(홀수 나머지)임