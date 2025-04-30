function solution(lines) { // lines = [[0,2], [-3,-1], [-2,1]]
  const map = new Map();
  let  count = 0;
  for (let line of lines) {
    let [start, end] = line;
    for(let i = start; i < end; i++) {
      const pointCount = map.get(i) || 0;
      map.set(i, pointCount + 1);
      if(pointCount === 1) count++;

    }
  }
  return count;
}

// 1. 겹쳐지는 지점을 구한다.
// 2. 겹쳐지는 지점의 구간 개수를 계산한다.

// 방법
// [start, end] ? 아무리 생각해도, 떠오르지 않는다.
// 핵심: 구간의 시작점을 구하는 것이다 
// 🐥 겹쳐지는 지점을 구할때, 🐥 구간의 시작점을 구하는 것이다.
// [0,2] => start=0; end<2 으로, end(2)는 미포함한다.
// 왜냐면 0,2 의 구간은 [0,1], [1,2] 이므로, 구간의 시작점은 0,1 이기 때문이다. (구간의 시작점 개수는, 구간의 개수와 같다.)
// 즉, 구간의 시작점이 겹치는 개수를 구하면 -> 겹치는 구간의 개수를 구할 수 있다.

// 구 문제풀이
// function solution(lines) { 
//   const map = new Map();
//   for (let line of lines) {
//     let [start, end] = line;
//     for(let i = start; i < end; i++) {
//       map.set(i, (map.get(i) || 0) + 1);
//     }
//   }

//   const set = new Set();
//   for(let [key, value] of map) {
//     if(value >= 2) {
//       set.add(key);
//     }
//   }

//   return set.size;
// }