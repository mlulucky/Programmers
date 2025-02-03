function solution(my_string) {
	const alphabet = ['a', 'e', 'i', 'o', 'u'];
	
	return alphabet.reduce((acc, cur) => {
			return acc.replaceAll(cur, '');
	}, my_string);
}

// 다른방법: 정규식
// return my_string.replace(/[aeiou]/g, '');

// 다른방법: set, has, filter 사용
// const set = new Set(['a','e','i','o','u']);
// return [...my_string].filter(val => !set.has(val)).join('')