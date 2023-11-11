function solution(binomial) {
	let [a, op, b] = binomial.split(" ");
	return op === "+" ? (+a + +b) : op === "-" ? (a - b) : (a * b);

}


// 자바스크립트에서 - 와 * 연산자는 문자열에 적용할때 자동으로 문자열을 숫자로 변환한다.
// 따라서 + 연산인 경우에만 문자열이 숫자로 연산될 수 있도록 문자열에 +를 붙여준다 -> +문자열 + +문자열

// 참고할만한 번외 문제풀이 _ 객체 구조분해 할당, 객체에 key value 값으로 함수 할당, 문자열 -> 숫자변환 방법
// let ops = {
// 	"+" : (a, b) => a + b,
// 	"-" : (a, b) => a - b,
// 	"*" : (a, b) => a * b
// };

// let [a, op, b] = binomial.split(" ");
// return ops[op](+a, +b) // 연산자에 해당하는 함수를 호출

// 번외 문제풀이
// let answer = 0;
// 	let strArr = binomial.split(" ");
// 	let firstValue = parseInt(strArr[0]);
// 	let secondValue = parseInt(strArr[2]);
// 	switch (strArr[1]) {
// 		case "+":
// 			answer = firstValue + secondValue;
// 			break;
// 		case "-":
// 			answer = firstValue - secondValue;
// 			break;
// 		case "*":
// 			answer = firstValue * secondValue;
// 			break;
// 	}
// 	return answer;