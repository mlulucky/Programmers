function solution(balls, share) {
	const vars = [balls, balls - share, share];
	const results = vars.map(value => {
		let varNum = value, result = 1;
		while (varNum > 0) {
			result *= varNum;
			varNum--;
		}
		return result
	});

	return Math.round(results[0] / (results[1] * results[2]));

}


// 다른방법
// 예) 5개 중 3개의 조합 - 5/3 * 4/2 * 3/1 == (5*4*3 / 3*2*1) == (5*4*3*2*1 / 3*2*1 * 2*1)
// function solution(balls, share) {
// 	let result = 1;
// 	while(share > 0) {
// 		result *= balls / share;
// 		balls--;
// 		share--;
// 	}
// 	return Math.round(result);
// }