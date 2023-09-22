function solution(my_string, is_prefix) {
	return my_string.split('').map((ele, idx)=> my_string.substring(0, idx)).some(i => i === is_prefix) ? 1 : 0;
}

// 번외 문제 풀이 _ 문자열.slice()
// return my_string.slice(0, is_prefix.length) === is_prefix ? 1 : 0;