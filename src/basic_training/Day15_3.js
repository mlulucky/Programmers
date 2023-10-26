function solution(num_list) {
	const count = 0;
	num_list.forEach((value) => {
		while (value !== 1) {
			if (value % 2 === 0) value /= 2;
			else value = (value - 1) / 2;
			count++;
		}
	})
	return count;
}


// 번외 문제풀이법 _ 배열.map() - 배열의 모든 요소에대해 연산 및 새로운 배열로 반환
// 배열 반환이 아닌 단순히 배열의 모든 요소에 대해 연산을 수행할때는 forEach 사용권장
// num_list.map((value) => {
// 	while(value !== 1) {
// 		if(value % 2 === 0) value /= 2;
// 		else value = (value - 1) / 2;
// 		count++;
// 	}
// })
