function solution(n) {
	let num = 1;
	for(let i=num; ; i++){
			num *= i;  
	    if(num <= n && num*(i+1) > n) {
	        return i;
	    }
	}
	
}

// 다른방법
// let num = 1, i = 1;	
// while(num * i < n) {
// 		num *= ++i; 
// }
// return i;

