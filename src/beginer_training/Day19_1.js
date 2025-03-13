function solution(array) {
  return array.reduce((acc, cur) => {
      const match = cur.toString().match(/7/g);
      acc += match ? match.length : 0;
      return acc;
  }, 0);
}

// 다른방법: 배열 join(), 정규식, nullish 연산자 .? 활용
// return array.join('').match(/7/g)?.length ?? 0;

// 문자열 -> 배열 filter 사용
//return [...array.join('')].filter(val => val === '7').length;