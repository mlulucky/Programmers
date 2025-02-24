function solution(n) {
  const result = [];
  
  for(let i=0; i<=n; i++) {
      if(n%i === 0) result.push(i);
  }
  
  return result;
}

// 약수 - n(정수) 를 나누어 떨어지게 하는 수
// 1 ~ n // 수를 n 으로 나누어 떨어지는 수