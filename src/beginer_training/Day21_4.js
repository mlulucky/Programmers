function solution(spell, dic) {
    return dic.some(val => spell.every(char => val.includes(char))) ? 1 : 2;
}

// 배열.every()
// 배열의 모든 요소가 주어진 조건을 만족하는지 확인
// false 를 반환하면 즉시 배열 순회를 중단
// 모든 요소가 조건을 만족하면 true 를 반환   