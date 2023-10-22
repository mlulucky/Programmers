function solution(arr, queries) {
	queries.forEach(query => {
		const [startIndex, endIndex] = query;
		for (i = startIndex; i <= endIndex; i++) {
			arr[i]++;
		}
	})
	return arr;
}

// 번외 문제풀이 - for 2중 반복문
// function solution(arr, queries) {
// 	for (let i = 0; i < queries.length; i++) {
// 		let [startIndex, endIndex] = queries[i];
// 		for (let j = startIndex; j <= endIndex; j++) {
// 			arr[j] += 1;
// 		}
// 	}
// 	return arr;
// }

// 참고할만한 번외 문제풀이 - forEach, while 문
// function solution(arr, queries) {
//     queries.forEach(([s, e]) => {
//         while (s <= e) arr[s++]++;
//     });
//     return arr;
// }