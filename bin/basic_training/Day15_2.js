function solution(arr) {
	let newArr = [...arr];
	let count = 0;
	while (true) {
		newArr = newArr.map(value => { // 배열의 업데이트를 할당
			if (value >= 50 && value % 2 == 0) return value / 2;
			if (value < 50 && value % 2 == 1) return value * 2 + 1;
			return value;
		})
		let isEqual = newArr.every((value,index) => value === arr[index]);
		if (isEqual) return count;
		arr = newArr;
		count++;
	}
}

// 1. 자바스크립트 배열 값 비교
// 배열1.every((value, index) => value === 배열2[index])
// JSON.stringify(배열1) === JSON.stringify(배열2);

// 2. 자바스크립트 배열 참조 비교(참조 주소(메모리)비교) 
// 배열1 === 배열2

// 배열복사
// 배열변경
// 동일한지 확인 및 카운트반환(종료)
// 배열 기존배열에 대입 및 카운트 1증가
