function solution(my_string, m, c) {
	let str ='';
	for(let i=c-1; i<my_string.length; i+=m) {
		str += my_string.charAt(i);
	}
	return str;
}

// 자바스크립트 문자열 => 문자 배열 만드는 법
// 1. my_string.split('');
// 2. [...my_string];

// 자바스크립트 filter 사용법
// 배열.filter((value) => 조건식)

// 자바스크립트 map 사용법
// 배열.map((value, index) => 계산식(새로운 배열 요소로 반환))

// 번외 풀이법 _ filter
// function solution(my_string, m, c) {
//     return [...my_string].filter((value, index) => index % m === c - 1).join('');
// }