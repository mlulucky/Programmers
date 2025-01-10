function solution(slice, n) {
	const initSlice = slice;
	for(let i = 1; ; i++) {
			if(slice >= n) {
					return i;
			} 
			slice += initSlice
	}
}