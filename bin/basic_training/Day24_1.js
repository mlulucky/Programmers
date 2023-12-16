function solution(order) {
	return order.reduce((acc, cur) => acc + (cur.includes("americano") ? 4500 : 5000)
	, 0)
}


// 참고할만한 번외 문제풀이
// function solution(order) {
// 	return order.reduce((acc, cur) => acc + (cur.includes("latte") ? 5000 : 4500), 0)
// }