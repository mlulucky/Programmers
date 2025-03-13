function solution(array, height) {
  return array.filter(val => val > height).length;
}