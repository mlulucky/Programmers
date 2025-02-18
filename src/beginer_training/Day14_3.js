function solution(cipher, code) {
    const arr = [...cipher];
    let str = '';
    for(let i=code; i<=arr.length; i+=code) { 
        str += arr[i-1];
    }

    return str;
}

// 다른방법: filter 사용
// [...cipher].filter((_, idx) => (idx+1) % code === 0).join('');