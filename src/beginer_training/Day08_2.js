function solution(age) {
	const arr = String(age).split('');
	let result = '';
	const alphabets = ['a','b','c','d','e','f','g','h','i','j'];
	
	for(let num of arr) {
			result += alphabets[num]
	}
	
	return result;
}

// 다른방법
// const arr = String(age).split('');
// return arr.map((num, idx) => 'abcdefghij'[num]).join('');

// 문자열[0] 으로도 문자열을 선택할 수 있다.
// 'abc'[0] == 'a'
// 'abcdefghij'[2] == 'c'