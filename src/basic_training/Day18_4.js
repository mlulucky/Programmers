function solution(myString, pat) {
	let str = myString.split("").map(item => item === "A" ? "B" : "A").join('');
	return str.contains(pat) ? 1 : 0;
}

// 문자열.split('') -> 문자열의 각 문자를 분리하여 배열의 요소로 만든다.
// 배열.join('')  -> 배열의 요소 사이에 아무런 문자도 추가하지 않고 모든 요소를 연결하여 하나의 문자열로 만든다.

// 문자열을 문자열배열로 만든후, 문자를 바꾼뒤에 join("") 으로 다시 배열을 문자로 만들기 

// 문자열.contains() : 자바 문법, 문자열에 특정 문자가 포함되있는지를 true, false 로 반환
// 문자열.includes() : js 문법, 문자열에 특정 문자가 포함되있는지를 true, false 로 반환