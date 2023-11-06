function solution(my_string) {
	return my_string.split(" ").filter(item => item !== "");
}

// 동일한 결과
// return my_string.split(" ").filter(item => item);
// item 이 true 인 값만 반환
// "" 공백은 false 이므로 값에서 제외되므로
// 자바스크립트에서 'falsy' 값은 false, 0, ""(빈 문자열), null, undefined, NaN 


// 번외문제풀이 _ 공백 정규표현식
// return my_string.trim().split(/\s+/);

// /는 정규 표현식 패턴의 시작과 끝을 나타내며, \s+는 하나 이상의 공백 문자

