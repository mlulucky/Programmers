function solution(my_string) {
	return [...my_string].filter(char => !isNaN(Number(char))).map(Number).reduce((acc,cur) => acc += cur ,0);
}