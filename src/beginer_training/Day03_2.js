function solution(array) {
	const arr = array.sort((a,b) => a - b).filter((val, idx) => idx === ((array.length-1)/2));
	return arr[0];
}