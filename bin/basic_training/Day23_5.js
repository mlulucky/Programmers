function solution(date1, date2) {
	let [year1, month1, day1] = date1;
	let [year2, month2, day2] = date2;
	return new Date(year1, month1, day1) < new Date(year2, month2, day2) ? 1: 0;
}

// 참고할만한 번외 문제풀이
// return new Date(date1) < new Date(date2) ? 1 : 0;