function solution(strArr) {
	let obj = strArr.reduce((acc, cur) => { // acc : 초기값,누적값 , cur: 현재값
		const length = cur.length;
		acc[length] = acc[length] || []; // acc[length] 값이 있으면 acc[length], 값이 없으면 []
		acc[length].push(cur);
		return acc;
	}, {});
     return Math.max(...Object.values(obj).map(arr => arr.length));
}

// 참고할만한 번외 문제풀이
// const arr = Array(31).fill(0);
// for(const str of strArr) {
// 	arr[str.length]++;  
// }
// return Math.max(...arr);

// arr = [0,0,0,....] 배열의 요소 31개를 0으로 채운 배열을 생성
// arr["apple".length]++
// arr[5]++ => arr배열의 5번째 인덱스 요소의 값을 +1 


// 🐥 Math.max() 사용법 : 가장 큰 수를 반환
// Math.max(2,4,5) => 5
// Math.max(...[2,4,5]) == Math.max(2,4,5) => 5
// ...[2,4,5] == 2,4,5

// obj = {1: ["a", "b"], 2: ["bc", "fg"], 3: ["abc"]};
// return Math.max(...Object.values(obj).map(arr => arr.length));
// Object.values(obj) : 객체 obj 의 모든 값을 배열의 형태로 반환 
// arr = [['a','b'], ['bc'], ['abc']]
// Object.values(obj).map(arr => arr.length) == [2,1,1]
// Math.max([2,1,1]) X 😵 --> Math.max 의 인자로는 숫자만 받을 수 있는데, 배열이 오면 NaN(숫자가 아니다) 결과가 나옴.
// -> 따라서 ...[2,1,1] 로 대괄호 배열 껍데기를 벗겨주기 == 2,1,1

// 번외 문제풀이
// -> Math.max 안쓰고 obj 에서 obj[key]의 배열 길이가 가장 큰 값을 반환
// let maxLength = 0;
// 	for (let key in obj) {
// 		if (obj[key].length > maxLength) {
// 			maxLength = obj[key].length;
// 		}
// 	}
// 	return maxLength;