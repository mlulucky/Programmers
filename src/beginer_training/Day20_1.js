function solution(dots) {
    const xSet = new Set(dots.map(arr => arr[0]));
    const ySet = new Set(dots.map(arr => arr[1]));

    const [x1, x2] = [...xSet];
    const [y1, y2] = [...ySet];

    return Math.abs(x1 - x2) * Math.abs(y1 - y2);
}