function solution(my_string, alp) {
	return my_string.replaceAll(alp, alp.toUpperCase());
}

// 문자열.replaceAll(특정문자, 바꿀문자)
// 문자열에서 특정문자를 바꾸는 메서드
// 특정문자를 포함하지 않는 경우 문자 그대로 반환