function solution(my_string, index_list) {

	return index_list.map(idx => my_string[idx]).join('');
}

// 문자열을 연결 :  + || concat() 
// 여러 배열을 연결 : concat()
// 배열의 요소를 연결한 하나의 문자열로 반환 : join()

// map : 배열의 모든 요소를 모아 새로운 배열을 반환
// index_list.map(idx => str[idx]) : 배열의 요소 idx 를 str[idx] 로 변경
// => ['str[idx]','str[idx]','str[idx]']

// join
// index_list.map(idx => str[idx]).join() 
// => 'str[idx]','str[idx]','str[idx]'
	
// join('')
// index_list.map(idx => str[idx]).join('')
// =>'str[idx]str[idx]str[idx]' 
