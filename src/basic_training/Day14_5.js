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

