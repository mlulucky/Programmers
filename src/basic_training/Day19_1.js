function solution(myStr) {
	let list = myStr.split(/a|b|c/).filter(item => item);
	return list.length ? list : ["EMPTY"]
}


// 자바스크립트에서 정규표현식
// | 또는 사용시 문자열은 / 으로 감싸기
// 문자열.split(/a|b|c/)

// 참고할만한 번외 문제풀이
// const solution=s=>s.match(/[^a-c]+/g)||['EMPTY']
// s에서 'a', 'b', 'c'를 제외한 모든 문자들로 구성된 부분 문자열들을 배열로 반환
// 뒤의 +는 하나 이상의 연속된 문자
// g 플래그는 전역 검색을 의미하여 문자열 전체에서 모든 일치 항목을 찾음.
// 일치하는 부분이 없으면 ['EMPTY']를 반환