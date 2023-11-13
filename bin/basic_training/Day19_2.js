function solution(arr) {
	let list = [];
	arr.forEach(item => {
		let count = 0;
		while(count++ < item) {
			list.push(item);
		}
	})
	return list;
}


// 참고할만한 문제풀이1
// arr.map((v) => Array(v).fill(v)).flat();

// Array(v) : 길이가 v 인 배열을 만든다.
// fill(v) : 배열 요소를 v 로 채운다.
// falt() : 배열을 합쳐서 1차원 배열로 만든다.
// [2,3,1] -> [2,2] , [3,3,3], [1] -> flat() -> [2,2,3,3,3,1]

// 참고할만한 문제풀이2
// arr.reduce((list, num) => [...list, ...new Array(num).fill(num)], []);

// list 는 현재까지 누적된 배열
// num 은 현재 순회중인 arr 요소
// [...list, ...new Array(num).fill(num)]
// 현재까지 누적된 배열 + 배열의 길이가 num 이고 요소가 모두 num 으로 채워진 배열을 합침