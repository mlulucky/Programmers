function solution(my_string) {
let arr = new Array(52).fill(0);
	[...my_string].forEach((value) => {
		let valueCharCode = value.charCodeAt(); 
		let idx = value === value.toUpperCase() ? (valueCharCode - 'A'.charCodeAt()) : (valueCharCode - 'a'.charCodeAt() + 26)
		arr[idx]++;
	});
return arr;
}

// 문자 유니코드 값
// 문자.charCodeAt();

// js forEach
// 배열.forEach((value, index) => )

// 🍉 참고할 만한 번외 문제풀이
// function solution(str) {
//     return [...str].reduce((p, c) => (p[c.charCodeAt() - (c === c.toLowerCase() ? 71 : 65)]++, p), Array(52).fill(0));
// }