function solution(numbers, n) {
	return numbers.reduce((pre, cur) => pre <= n ? pre + cur : pre);
}