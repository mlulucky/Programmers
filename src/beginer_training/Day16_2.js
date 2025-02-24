function solution(array) {
  const max = [...array].sort((a,b) => b - a)[0]
  const idx = array.indexOf(max);
  
  return [max, idx];
}

// 배열 요소 최대값 찾는 법
// 다른방법: Math.max 활용
// Math.max(...배열)
// const max = Math.max(...array);