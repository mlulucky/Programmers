function solution(n) {
    const arr = [];
    for(let i=1; arr.length<100; i++) {
       if(i % 3 === 0 || String(i).includes('3')) {
            continue;
        }
        arr.push(i); 
    }
    return arr[n-1];
}
// for문의 인덱스값을 배열요소로 넣을때, 인덱스를 100까지 하고, 값은 그 이상?으로 하는 부분을 고려하기 어려웠음
// 결국 배열에 추가된 길이가 100이 될때까지 반복문을 돌리면 해결
// 1부터 시작해서 3의 배수이거나 3이 포함된 숫자는 제외하고 배열에 추가