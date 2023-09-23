function solution(my_string, s, e) {
	let reversedStr = my_string.split('').slice(s, e+1).reverse().join('');
	return my_string.replace(my_string.slice(s,e+1), reversedStr);
}

// 자바스크립트 문자열 뒤집기
// 배열로 만들어서 내장함수 reverse() 사용하면 쉽게 뒤집을 수 있다.
// 다른 방법으로는 직접 반복문 For 문을 돌려서 뒤집는다.  

// 문자열 바꾸기
// 문자열.replace("a","b") : 문자열의 a 값을 b 로 바꾼다.