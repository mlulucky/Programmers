function solution(number) {
	return number.split('').reduce((pre,cur)=> +pre + +cur, 0) % 9;
}

// reducer((이전값, 현재값)=> 연산 , 초기값) : 0(초기값) + pre => + pre + cur => pre + cur ...
// reducer (()=> { }) 중괄호를 하는 경우는 return 문이 있어야 값이 반환이 되고, 없을시 undefined 됨
// 중괄호가 없는경우에는 식으로 간주되고, 식의 결과가 자동으로 반환된다. 
// '문자열' + '문자열' => 숫자로 연산하는 방법 - 예) +'1' + +'2' = 3 문자열 앞에 + 연산자 붙이기 