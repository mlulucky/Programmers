function solution(numbers) {
	const numbersSum = numbers.reduce((sum, currentValue) => sum + currentValue, 0);
	return numbersSum/numbers.length;
}