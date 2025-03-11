function solution(my_string) {
  return my_string.split(' ').reduce((acc, cur, idx, arr) => {
      if(idx === 0) acc += +cur;
      if(idx % 2 !== 0) {
          acc = cur === '+' ? acc + (+arr[idx+1]) : acc - (+arr[idx+1]); 
      }
      return acc;
  } ,0)
  
}

// 정리
// return my_string.split(' ').reduce((acc, cur, idx, arr) => {
//   if(idx === 0) return +cur;
//   if(cur === '+') return acc + (+arr[idx+1]);
//   if(cur === '-') return acc - (+arr[idx+1]);
//   return acc;
// } ,0)