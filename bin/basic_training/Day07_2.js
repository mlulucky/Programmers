function solution(l, r) {
    let answer = [];
    for(let i=l; i<=r; i++) {
        let str = i.toString();
        if(/^5[05]*$/.test(str)) answer.push(Number(str));
        
    }
    if(answer.length == 0) answer.push(-1);

    return answer;
}