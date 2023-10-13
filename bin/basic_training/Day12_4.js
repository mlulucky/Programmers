function solution(arr) {
	let idx = arr.map((value, index) => value === 2 ? index : -1);
	let idxArr = idx.filter(value => value !== -1);
	return idxArr.length == 0 ? [-1] : arr.slice(idxArr[0], idxArr[idxArr.length-1]+1);	
}



// 참고할만한 번외 문제풀이 _ indexOf, lastIndexOf
// let start = arr.indexOf(2);
// let last = arr.lastIndexOf(2);
// return start === -1 ? [-1] : arr.slice(start, last+1);

// 와.. 너무 간편하고 쉬운 답이다. 감탄
// map, filter 를 이용한 것 보다 4배는 빠르다.