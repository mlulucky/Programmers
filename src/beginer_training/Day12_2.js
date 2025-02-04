function solution(my_string) {
	const numbers = [...my_string].filter(v => !isNaN(Number(v)) && v.trim !== '').map(Number);
	return numbers.sort((a,b) => a-b);
}

// NaN 타입
// NaN 이 아닌지 확인 => isNaN(값)
// '' 빈문자열도 Number('') = 0 으로 반환된다.

// 배열.map(Number)
// 배열의 요소를 Number 타입으로 반환한다.