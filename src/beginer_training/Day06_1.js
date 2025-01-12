function solution(my_string) {
	const strArr = my_string.split('');
	const res = [];
	while(strArr.length > 0) {
			res.push(strArr.pop());
	}
	
	return res.join('');
}