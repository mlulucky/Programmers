function solution(s) {
	return s.split(' ').reduce((acc, cur, idx, arr) => {
			if(cur === 'Z') {
					acc -= Number(arr[idx-1]);
			} else {
					acc += Number(cur);
			}
			return acc;
	}, 0)
	
}

// 문제 푸는게 좀 어려웠던 것
// 1. 필터를 생각 (지난 요소에 대한 값을 변경이 안됨)
// 2. reduce 할때, 배열과 배열의 요소에 대해 조작하는 부분에 대해 명확히 생각을 못함 
// -> reduce 할때, arr, idx 인자를 활용하여 풀이