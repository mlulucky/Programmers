function solution(arr) {
	let count = 1;
	while (count < arr.length) count *= 2;
	return [...arr, ...new Array(count - arr.length).fill(0)];
}

// 참고할만한 번외 문제풀이
// const targetLength = Math.pow(2, Math.ceil(Math.log2(arr.length)));
// const num = targetLength - arr.length;
// return arr.concat(Array(num).fill(0));

// Math.log2(arr.length) : arr.length 가 2의 몇승인지 ex) 6 -> 2.xxx 승
// Math.ceil() : 가장가까운 정수로, 소수점 올림
// Math.ceil(Math.log2(arr.length)) : arr.length 의 가장 가까운 2의 거듭제곱승을 확인가능
