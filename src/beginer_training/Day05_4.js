function solution(num_list) {
	const result = [];
	while(num_list.length > 0) {
			result.push(num_list.pop());
	}
	
	return result;
}