function solution(score) {
    const aveScore = score.map(([a,b]) => (a + b) / 2); // [ 75, 70, 55, 65 ]
    const sortScore = [...aveScore].sort((a,b) => b - a); // [ 75, 70, 65, 55 ]

    return aveScore.map((val) => sortScore.indexOf(val) + 1);
}