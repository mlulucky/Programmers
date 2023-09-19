function solution(my_string, n) {
	return my_string.slice(my_string.length - n);
}

// 자바스크립트 문자열 길이
// 문자열.length

// 자바스크립트 문자열 자르기
// 문자열.slice
// substring 과 비슷하나, 
// 차이점은 인자가 음수일때, substring 은 빈배열 반환 / slice 는 문자열 반환(뒤에서부터 인덱스 적용)

// 문자열.substring(start, end) : 시작인덱스에서 끝 인덱스전까지 문자열 반환

// slit - 구분자로 자르기 => 배열 반환
// const str = "hello, world, javascript";
// str.split(',');
// str = ['hello', 'world', 'javascript']