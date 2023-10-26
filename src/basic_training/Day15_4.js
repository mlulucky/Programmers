function solution(num_list) {
	return num_list.reduce((pre,cur) => num_list.length >= 11 ? pre + cur : pre * cur);
}