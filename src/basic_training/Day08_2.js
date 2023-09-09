function solution(a,b,c,d) {
	const arr = [a,b,c,d];
	/**
	 * every() 함수 : 모든요소가 조건을 만족하는지, boolean 값 반환 
	 * some() 함수 : 어떤요소라도 조건을 만족하는지, boolean 값 반환
	*/
	// 배열의 요소가 모두 같은 값일 때
	if(arr.every(item => item === arr[0])) {
		return 1111 * a;
	}
	
	let newArr = arr.filter((value, index) => arr.indexOf(value) !== index); 

	// 배열의 요소중 3개의 값이 같고, 나머지 하나가 다를때
	// [1,3,3,3] => [3,3] 중복되는 값이 2개가 나오는데, 그 값이 똑같을때! (나머지값은 중복되는 값과 동일한게 아닌것!)
	if(newArr.length === 2 && newArr.every(item => item === newArr[0])) { // [3,3] 
		let arr1 = arr.filter((item) => item !== newArr[0]) // 다른값 [1]
		let p = newArr[0]; // 중복된 값
		let q = arr1[0]; // 다른 값
		return (10 * p + q) ** 2;
	} 
	
	// 두개의 요소가 같고 나머지 2개의 요소도 같을때 (== 중복되는 값이 2개 일때)
	// [2,2,4,4] => [2,4] 중복되는 값이 2개가 나오고, 그 값이 다를때
	if(newArr.length === 2 && newArr[0] !== newArr[1]) { // [2,4]
		let p = newArr[0];
		let q = newArr[1];
		return (p+q) * Math.abs(p-q);
	}

	// 두개의 요소가 같고 나머지 2개의 요소가 다를때 (== 중복되는 값이 1개 일때)
	// [1,1,2,3] => [1] 중복되는 값이 1개가 나온다. (나머지 값은 중복되는 값을 제외한 값들)
	if(newArr.length === 1) { // [1]
		let anotherArr = arr.filter(item => item !== newArr[0]);
		let p = anotherArr[0];
		let q = anotherArr[1];
		return p * q;
	}

	// 모든 요소의 값이 다르면
	if(newArr.length === 0) {
		arr.sort((a,b) => a-b); // arr 오름차순 정렬
		return arr[0];
	}
}