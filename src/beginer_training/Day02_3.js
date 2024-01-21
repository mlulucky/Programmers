function solution(numer1, denom1, numer2, denom2) {
	let a;
	let numer;
	let denom;
	if (denom1 % denom2 === 0 && denom1 > denom2) {
		a = denom1 / denom2;
		numer2 *= a;
		numer = numer1 + numer2;
		denom = denom1;
	}
	else if (denom2 % denom1 === 0 && denom2 > denom1) {
		a = denom2 / denom1;
		numer1 *= a;
		numer = numer1 + numer2;
		denom = denom2;
	}
	else {
		numer1 *= denom2;
		numer2 *= denom1;
		numer = numer1 + numer2;
		denom = denom1 * denom2;
	}
	const g = gcd(numer, denom);
	return [numer / g, denom / g];
}

function gcd(a, b) {
	return b ? gcd(b, a % b) : a;
}

// 분자 numer // 분모 denom
// 분모가 배수일때

// 분모가 배수가 아닐때 -> 분모끼리 곱하기 -> 상대방값을 