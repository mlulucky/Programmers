function solution(num_str) {
	return num_str.split("").map(item => parseInt(item)).reduce((acc, cur) => acc + cur, 0)
}

// 🤔 참고할만한 번외 문제풀이
// return [...num_str].reduce((acc,cur) => acc + +cur, 0);