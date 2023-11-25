function solution(arr, n) {
	return arr.map((item, idx) => {
		item += arr.length % 2===0 ? (idx % 2 === 0 ? 0 : n) : (idx % 2 === 0 ? n : 0);
	});
}

// 👀 참고할만한 번외 문제풀이
// arr.map((item, idx) => arr.length % 2 !== idx % 2 ? item + n : item);

// length 가 5일때
// [49, 12, 100, 276, 33] length : 5  // idx : 0,1,2,3,4
// length%2 === 1 
// 0 % 2  === 0 (짝수) // 1 과 다르다
// 1 % 2  === 1 (홀수) // 1 과 같다
// 2 % 2  === 0 (짝수) // 1 과 다르다
// 3 % 2  === 1 (홀수) // 1 과 같다
// 4 % 2  === 0 (짝수) // 1 과 다르다
// 1과 다른 짝수(idx 가 0,2,4) 일때 item +n, 같을때 item 그대로

// [444, 555, 666, 777] length : 4    // idx : 0,1,2,3
// length%2 === 0
// 0 % 2 === 0
// 1 % 2 === 1
// 2 % 2 === 0
// 3 % 2 === 1
// 0 과 다른 홀수(idx 가 1,3) 일때 item +n, 같을때 item 그대로


