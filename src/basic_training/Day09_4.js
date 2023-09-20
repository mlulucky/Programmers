function solution(my_string) {
	
	return my_string.split('').map((ele, idx)=> my_string.substring(idx)).sort();
}

// my_string.split(''); // ['b','a','n','a','n','a']
// idx == 0 => my_string.substring(0) == 'banana'
//(왜냐? my_string 은 'banana' 이기 때문에 😋)

// 자바스크립트 배열.slice(시작인덱스, 마지막인덱스(포함x)); 
// 자바스크립트 배열.substring(시작인덱스, 마지막인덱스(포함x)); 
// 새로운 배열 반환

// 🌼 번외 문제풀이
// let answer = [];
// let arr = my_string.split(''); // ['b','a','n','a','n','a']

// for(let i=0; i<my_string.length; i++) {
// 	answer.push(arr.slice(i).join('')); // 'banana'
// }
// return answer.sort();