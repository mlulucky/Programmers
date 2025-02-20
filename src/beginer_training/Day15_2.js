function solution(my_string, num1, num2) {
	let arr = [...my_string];
	let temp = arr[num1];
	
	arr[num1] = arr[num2];
	arr[num2] = temp;
	
	return arr.join('');
}

// 다른방법: temp 대신 구조분해할당
// 한번에 값을 변경
// let a = 1, b = 2;
// [a,b] = [b,a]
// -> a = 2, b = 1