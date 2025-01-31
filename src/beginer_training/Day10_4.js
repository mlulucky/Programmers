function solution(numbers, direction) {
	return numbers.map((_, idx) => {
		if (direction === 'left') {
			if (idx === numbers.length - 1) return numbers[0];
			return numbers[idx + 1];
		}
		else {
			if (idx === 0) return numbers[numbers.length - 1];
			return numbers[idx - 1];
		}
	})
}

// 다른방법
// right 뒤 요소를 제거(pop), 앞에 추가(unshift)
// left 앞 요소를 제거(shift), 뒤에 추가(phsh)

// direction === 'right' ? numbers.unshift(numbers.pop()) : numbers.push(numbers.shift());
// return numbers; 