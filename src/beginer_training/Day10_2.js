function solution(num_list, n) {
	const result = [];
	for(let i=0; i<num_list.length; i+=n) { 
			result.push(num_list.slice(i,i+n));
	}
	
	return result;
}

// 다른방법 배열.reduce
// return num_list.reduce((acc, curr, idx) => {
// 	if(idx % n === 0) {
// 			acc.push([]);
// 	}        
// 	// acc = [[ ]], [[],[]], [[],[],[]]
// 	// a.length = 1, 2, 3
// 	acc[acc.length - 1].push(curr);
// 	// acc[0].push() // 1,2,3
// 	// acc[1].push() // 4,5,6
// 	// acc[2].push() // 7,8,9
// 	return acc;
// }, []);

// while, 배열.splice
// while(num_list.length) {
// 	answer.push(num_list.splice(0,n));
// }

// Array(배열개수).fill([])
// return Array(num_list.length / n).fill([]).map(() => num_list.splice(0, n))

