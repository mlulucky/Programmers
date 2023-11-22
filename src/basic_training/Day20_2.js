function solution(arr1, arr2) {
	if(arr1.length !== arr2.length) {
		return arr1.length - arr2.length > 0 ? 1 : -1;
	}
	else {
		let arr1Sum = arr1.reduce((pre, cur) => pre + cur, 0);
		let arr2Sum = arr2.reduce((pre, cur) => pre + cur, 0);
		return arr1Sum - arr2Sum > 0 ? 1 : arr1Sum - arr2Sum < 0 ? -1 : 0;
	}
}