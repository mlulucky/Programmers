function solution(my_string, is_suffix) {

	return my_string.split('').map((ele, idx)=> my_string.substring(idx)).some(i => i === is_suffix) ? 1 : 0;	
}


// is_suffix 문자열과 동일하다면(===) return 1
// 배열.some(조건) : 배열에서 조건에 맞는 요소가 하나라도 있으면 true 반환

// let str = 'banana';
// str.split('').map((ele, idx)=> str.substring(idx));
// ['banana', 'anana', 'nana', 'ana', 'na', 'a']
