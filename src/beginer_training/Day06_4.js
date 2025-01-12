function solution(my_string, n) {
	let res = [];
	for(let i=0; i<my_string.length; i++) {
			res.push(my_string[i].repeat(n));
	}
	return res.join('');
}

// map 으로 하는 방법도 있음
// [...my_string].map((val, idx) => val.repeat(n)).join('');