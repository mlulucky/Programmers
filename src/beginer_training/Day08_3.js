function solution(emergency) {
	const dup = [...emergency].sort((a,b) => b - a).map((val, idx) => [val, idx+1]);
	const arrToMap = new Map(dup);

	return emergency.map((val) => arrToMap.get(val));
}

// 다른방법
// 오름차순 정렬 후, map 을 통해 배열의 요소를 해당 인덱스로 변경
// const arr = [...emergency].sort((a,b) => b - a);
// return emergency.map((val) => arr.indexOf(val) + 1)