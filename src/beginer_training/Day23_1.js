function solution(numlist, n) {
  return numlist.sort((a, b) => {
    return Math.abs(a - n) - Math.abs(b - n) || b - a;
  });
}
// falsy || 연산자는 왼쪽 값이 false 이면 오른쪽 값을 반환
// Math.abs(a - n) - Math.abs(b - n)값이 0 (값의 차이가 동일하면)일때 b - a (내림차순 정렬 - 값이 큰 수가 앞으로 정렬) 반환