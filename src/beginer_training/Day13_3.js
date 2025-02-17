function solution(my_string) {
	return my_string.split('').reduce((acc, cur) => {
			if(!acc.includes(cur)) acc.push(cur)
			return acc;
	}, []).join('');
}

// 다른방법: set 이용
// [...new Set(my_string)].join('');