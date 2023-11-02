function solution(myString, pat) {
	let count = 0;
	Array.from(myString).forEach((_, index) => myString.slice(index).startsWith(pat) ? count++ : count)
	return count;
}