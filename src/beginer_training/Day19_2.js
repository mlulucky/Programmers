function solution(my_str, n) {
  let arr = [];
  for(let i=0; i<my_str.length; i+=n) {
    arr.push(my_str.substring(i, i+n));
  }
  return arr;
}

// 배열.slice()
// 원본배열 영향x, 새로운 배열 반환

// 문자열.substring()
// 원본 문자열 영향x, 잘라진 문자열 반환