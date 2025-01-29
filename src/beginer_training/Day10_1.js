function solution(dot) {
	const [x, y] = dot.map(value => value > 0);
	return x ? (y ? 1 : 4) : (y ? 2 : 3);  
}