function solution(myString) {
	return myString.split("x").map(item => item.length)
}

// 자바 vs 자바스크립트 split
// 자바 split 함수는 문자열 끝에 위치한 구분자를 통해 생성된 빈문자열은 제거
// 그래서 인자로 -1 을 전달해야 마지막 빈문자열도 포함해서 결과 반환

// 자바스크립트 split 함수는 문자열 끝에 위치한 구분자를 통해 생성된 빈 문자열도 포함해 결과반환
// -1 인자 전달하지 않아도 됨.