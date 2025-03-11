function solution(s1, s2) {
  return [...s1].filter(val => s2.includes(val)).length;  
}

// 다른방법: set 활용
// let set = new Set(s1);
// return s2.filter(val => set.has(val)).length;