function solution(arr) {
	return arr.map(value => {
		if(value >= 50 && value % 2 === 0) value /= 2;
		else if(value <50 && value % 2 === 1) value *= 2;
		return value;
	})
}