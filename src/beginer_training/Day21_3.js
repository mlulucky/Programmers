function solution(sides) {
    const [a, b] = sides;
    const all = a + b;
    const max = Math.max(a,b);
    const min = all - max;

    return all - (max - min) - 2 + 1;
}