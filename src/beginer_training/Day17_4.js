function solution(quiz) {
  return quiz.map((val, idx) => {
      let [num1, calc, num2, , res] = val.split(' ');
      const realRes = calc === '-' ? Number(num1) - Number(num2) : Number(num1) + Number(num2); 
      return realRes === Number(res) ? 'O' : 'X'
  })
}

// 다른방법: eval(문자열) - 문자열을 코드로 실행
// eval('2 + 3') = 5
// 실제로는 절대 사용하지 말 것