function solution(numbers) {
  let max = -Infinity;
  for(let i=0; i<numbers.length; i++) {
      for(let j=i+1; j<numbers.length; j++) {
          let val = numbers[i]*numbers[j];
          if(val > max) {
              max = val;
          }
      }
  }
  
  return max;
}