function solution(n) {
  const num = Math.sqrt(n) 
  return num === Math.floor(num) ? 1 : 2;  
}

// floor 버림 -> Math.floor(num)
// ceil 올림 
// round 0.5 기준 올림,버림

// 제곱수 여부 확인
// Math.sqrt(num)
// 완전 제곱근이면 정수 반환, 아니면 소수 반환

// Math.sqrt(9) (완전)제곱수 -> 3
// Math.sqrt(2) -> 1.4xxx...
