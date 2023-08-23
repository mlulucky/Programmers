function solution(start_num, end_num) {
    // [start_num, start_num+1, ..... end_num]
    const answer = [];
    for(let i=start_num; i<=end_num; i++) {
        answer.push(i);
    }
    
    return answer;
}