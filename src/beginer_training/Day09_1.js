function solution(hp) {
	const powers = [5,3,1];
	let count = 0;

	for(let power of powers) { 
			if(hp == 0) break;
			let value = Math.floor(hp/power); 
			hp -= (power*value); 
			count += value;
	}

	return count;
}

// 다른방법 - 나머지 활용
// Math.floor(hp/5) + Math.floor((hp%5)/3) + (hp%5)%3;


