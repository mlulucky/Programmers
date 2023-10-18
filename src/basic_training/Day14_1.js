function solution(num_list) {
	let sumResult = num_list.reduce((pre,cur,index) => { // pre 이전값, cur 현재값
		index % 2 === 0 ? pre.oddSum += cur : pre.evenSum += cur; // 인덱스가 짝수 또는 홀수인 요소의 합 구하기
		return pre; // 메서드 각 반복마다 반환하도록 됨.(누적값)
	}, {oddSum: 0, evenSum: 0}); // 두번째 인수로 초기값 전달가능. 없는 경우 배열의 요소의 첫번째 값이 초기값

	return Math.max(sumResult.oddSum, sumResult.evenSum); 
}


// 참고할만한 번외 문제풀이 _ forEach
// let odd = 0;
// let even = 0;

// num_list.forEach((value, index) => {
// 	return index % 2 === 0 ? odd += value : even += value
// })

// return Math.max(odd, even);