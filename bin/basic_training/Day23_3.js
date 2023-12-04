function solution(num_list, n) {
	return num_list.includes(n) ? 1 : 0;
}

// 번외 문제풀이 _ filter
// return num_list.filter(item => item === n).length > 0 ? 1 : 0;