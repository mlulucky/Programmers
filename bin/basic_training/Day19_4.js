function solution(arr) {
	const list = [];
	for (let num of arr) {
		(list.length === 0 || list[list.length-1] !== num) ? list.push(num) : list.pop();
	}
	return list.length < 1 ? [-1] : list;
}

// list.pop() : 배열 list 의 마지막요소 제거