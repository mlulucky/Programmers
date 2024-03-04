function solution(array) {
	let json = {};
	let max = 0;
	let count = 0;
	let maxKey;
	for(let num of array) {
		json[num] = (json[num] || 0) + 1; 
		if(json[num] > max) {
			max = json[num]; // 최대로 등장한 횟수
			maxKey = num;
		}
	}
	for(let key in json) { // max 값이 포함된 요소가 1개 이상인지
		if (json[key] === max) count++;  
	}
	return count > 1 ? -1 : maxKey;
}


// 최빈값 : 가장 자주 나오는 값
// 최빈값을 리턴, 최빈값이 여러개면 -1 리턴

