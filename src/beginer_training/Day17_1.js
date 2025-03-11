function solution(num, k) {
    let idx = String(num).indexOf(k);
    return idx = idx < 0 ? idx : idx + 1;
}

// 다른방법: 문자열 1개 추가 -> 인덱스를 반환
// (''+num).indexOf(k)
// (''+12345).indexOf('2'); -> 1 인덱스 반환