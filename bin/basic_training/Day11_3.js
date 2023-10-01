function solution(my_string, indices) {
	return [...my_string].filter((value, index) => !indices.includes(index)).join('');
}

// 🍉 문제풀이 _ 배열 forEach / join()
	// const strArr = [...my_string];
	// indices.forEach(value => strArr[value] = '');
	// return strArr.join('');

// 🍉 번외 문제풀이 _ 배열 map / includes / join()
// const result = [...my_string].map((value, index) => {
// 	if(indices.includes(index)) {return ''}
// 	return value;
// }).join('');
// return result;

// 🍉 번외 문제풀이 _ 배열 for of 문 / join()
// const strArr = my_string.split('');
// for(let idx of indices) {
// 	strArr[idx] = '';
// }
// return strArr.join('');