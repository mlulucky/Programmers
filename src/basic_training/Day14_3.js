function solution(todo_list, finished) {
	return todo_list.filter((_, index)=> !finished[index]);
}

// 번외 문제풀이 _ for 반복문
// let result = [];
// for(let i=0; i<finished.length; i++){
// 	if(finished[i] === false) result.push(todo_list[i]); 
// }
// return result;