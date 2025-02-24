function solution(s) {
	const obj = [...s].reduce((acc, cur) => {
			acc[cur] = (acc[cur] || 0) + 1;
			return acc;
	}, {})

	return Object.keys(obj).filter((key) => obj[key] === 1).sort().join('');
}

// 다른방법: indexOf - lastIndexOf 비교
// 처음 등장하는 인덱스와 마지막 등장하는 인덱스가 같으면 => 처음 등장한 요소 / 다르면 여러번 등장한 요소
// return [...s].filter((val) => s.indexOf(val) === s.lastIndexOf(val)).sort().join('');