function solution(str_list) {
	let lIndexOrRIndex = str_list.findIndex(value => value === "l" || value === "r"); // 첫번째 나온 요소의 인덱스를 반환하고 종료, 둘다없으면 -1 반환

	if(lIndexOrRIndex === -1) {
		return [];
	}
	return str_list[lIndexOrRIndex] === "l" ? 
		str_list.slice(0,lIndexOrRIndex) :
		str_list.slice(lIndexOrRIndex+1, str_list.length);
}

// map, filter 보다는 findIndex, 왜? 해당되는 문자열을 만나면 반복문을 중단해야하므로 
// 배열.findIndex((value, index)=> 조건식)

// 참고할만한 번외 문제풀이
// for(let i=0; i<str_list.length; i++) {
// 	if("l" === str_list[i]) return str_list.slice(0,i); 
// 	if("r" === str_list[i]) return str_list.slice(i+1);
// }
// return [];
// 초 깔끔하다..