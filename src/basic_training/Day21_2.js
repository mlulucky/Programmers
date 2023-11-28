function solution(rank, attendance) {
	let map = new Map();
	rank.forEach((item, idx) => {
			map.set(item, [idx, attendance[idx]]);
	})

	let arr = [...map].sort((a,b)=> a[0] - b[0]).filter(([r, [idx, att]]) => att).slice(0,3).map(([r, [idx, att]]) => idx);
	return arr.reduce((acc, cur)=> acc * 100 + cur);
}

// 😵 참고할만한 번외 문제풀이
// const [a,b,c] = rank.map((r, i) => [r, i]).filter(([_, i]) => attendance[i]).sort(([a],[b]) => a - b);
// return 10000 * a[1] + 100 * b[1] + c[1]; 
// 상위등수 3명을 구하는 경우 [a,b,c] 구조분해 할당으로 3개로 정해놓은 것이 좋은 아이디어!
// sort(([a], [b]) => a - b)에서 a와 b는 각 학생의 순위를 나타내는 rank

// 번외 문제풀이
// let map = new Map();
// 	rank.forEach((item, idx) => {
// 		map.set(item, [idx, attendance[idx]]);
// 	})
	
// 	let arr = [];
// 	let sortedMap = [...map.entries()].sort((a, b) => a[0] - b[0]);
// 	for(let [r, [idx, att]] of sortedMap) {
// 		if(arr.length === 3) break;
// 		if(att) {
// 			arr.push(idx);
// 		}
// 	}
    
// 	return arr.reduce((acc, cur)=> acc * 100 + cur);