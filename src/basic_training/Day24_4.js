function solution(myString) {
	return [...myString].map(value =>
		value = 'l' > value ? 'l' : value
	).join('');
}


// 문자열 -> 배열 만들기
// 1. split
// myString.split('')
// 2. 스프레드 연산자
// [...myString]

// 자바스크립트 알파벳 인덱스 구하기
// 1. 문자.charCodeAt(0) 메서드 이용
// 'l'.charCodeAt(0) > value.charCodeAt(0)
// 2. 문자자체로 크기 비교가능