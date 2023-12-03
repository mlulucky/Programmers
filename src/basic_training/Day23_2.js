function solution(str_list, ex) {
	return str_list.filter(item => !item.includes(ex)).join("");
}

// 문자열배열.join("");
// 구분자 없이 문자열 요소 연결