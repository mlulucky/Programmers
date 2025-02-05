function solution(n) {
    const result = [];
    for (let i = 2; i <= n; i++) { 
        if (n % i == 0 && isPrime(i)) result.push(i);
    }
    return result;
}

function isPrime(n) { 
    for(let i = 2; i < n; i++) { 
        if(n % i === 0) return false;
    }
    return true;
}


// 다른방법: 최적화
// 2 는 소수 true 반환
// 2로 나눠지는 짝수는 false 반화 (짝수 != 소수)
// 이후 제곱근에 대해서 확인
// 9 이하 홀수 3,5,7은 소수. 9 이상 홀수에 대해서 소수 검증로직!

// function isPrime(n) { 
// 	if(n === 2) return true;
// 	if(n % 2 === 0) return false; 
// 	for(let i = 3; i * i <= n; i+=2) { 
// 	    if(n % i === 0) return false;
// 	}
// 	return true;
// }