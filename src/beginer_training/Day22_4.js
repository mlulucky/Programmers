function solution(a, b) {
    while(b % 2 === 0) b /= 2;
    while(b % 5 === 0) b /= 5;
    if(a % b === 0) return 1;
    return 2;
}

// 분모가 2로 나누어떨어지는지
  // 나머지 몫이 5로 나누어 떨어지는지
  // 그 몫이 분자 a 로 나누어지는 지

  
// 다른풀이
// 분모분자를 기약분수로 만든 후, 분모가 2,5로 나누어떨어지는지 확인
//   for(let i=2; i<= Math.min(a,b); i++) {
//     if(a % i === 0 && b % i === 0) {
//         a = a / i;
//         b = b / i;
//     }
// }
// while(b % 2 === 0) b /= 2;
// while(b % 5 === 0) b /= 5;
// return b === 1 ? 1 : 2;