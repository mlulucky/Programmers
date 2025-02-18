function solution(order) {
	return [...String(order)].filter(val => '369'.includes(val)).length;
 
}