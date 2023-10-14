function solution(arr, query) {
	let answer = [...arr];
	query.forEach((value, index) => {
		answer = (index % 2 === 0) ? answer.slice(0, query[index]+1) : answer.slice(query[index], answer.length);
	});
	return answer;
}



// 번외 문제풀이 _ map
// map 메서드의 반환배열을 무시하고 그저 answer 배열의 변경을 위한 로직으로 사용됨
// function solution(arr, query) {
// 	let answer = [...arr];
// 	query.map((value, index) => {
// 		answer = (index % 2 === 0) ? answer.slice(0, query[index]+1) : answer.slice(query[index], answer.length);
// 	});
// return answer;
// }
// => 이 경우에는 map 대신에 forEach 나 for 반복문를 사용하는 것이 더 명확하다.

// 잘못된 예
// return query.map
// <- [undefined, undefined, undefined]
// query 배열의 요소개수만큼 새로 배열을 생성 반환하였는데
// 배열에 요소를 대입해준것이 아니므로 undefined 요소를 갖는다.

// return query.forEach
// <- undefined
// forEach 는 반복문 일뿐, 값을 반환하는것이 아니다