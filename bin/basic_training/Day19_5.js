function solution(arr, k) {
		return [...new Set(arr), ...new Array(k).fill(-1)].slice(0,k);
}

// 중복제거 배열 + k 원소만큼 -1 배열 추가 => k 개수만큼 배열 반환
// 배열 -> 문자열  join -> substring 문자열 자르기 -> 배열

