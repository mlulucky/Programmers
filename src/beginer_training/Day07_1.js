function solution(my_string, letter) {
	return my_string.replaceAll(letter, '');
}

// 다른방법
// my_string.split(letter).join('') 
// split 하는 letter 가 제거된다.