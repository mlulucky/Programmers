function solution(my_strings, parts) {	
	return my_strings.map((str, idx) => str.substring(parts[idx][0],parts[idx][1]+1)).join("");
}

// 🌼 번외 문제풀이
// let result="";
// for(let i=0; i<my_strings.length; i++) {
// 	result += my_strings[i].substring(parts[i][0], parts[i][1]+1);
// }
// return result;

// 🌼 번외 문제풀이
// function solution(my_strings, parts) {
	// return parts.map(([s, e], i) => {
	// 		return my_strings[i].slice(s, e + 1)
	// }).join('')
// }