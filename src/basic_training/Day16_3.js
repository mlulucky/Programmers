function solution(strArr) {
	return strArr.map((value, index) => {
		return value = (index%2===0) ? value.toLowerCase() : value.toUpperCase();
	})
}