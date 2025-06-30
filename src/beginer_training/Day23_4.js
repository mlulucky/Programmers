function solution(id_pw, db) {
  const [id, pw] = id_pw;
  const map = new Map(db);
  if(!map.has(id)) return 'fail';
  return map.get(id) === pw ? 'login' : 'wrong pw';
}


// 방법 1. for 문
// const [id, pw] = id_pw;
// for(let [dbId, dbPw] of db) {
//     if(dbId === id) {
//         return dbPw === pw ? 'login' : 'wrong pw';   
//     } 
// }
// return 'fail';

// new Map(이차원배열 요소)

// (사용자 입력 값) id_pw = [아이디, 비번]
// (db 보관 값) db = [아이디, 비번]
// 아이디: 영어 + 숫자 조합
// 비번: 숫자
// *아이디 중복 불가(유일, 키값)

// 아이디,비번일치 -> 로그인
// 아이디 일치x -> 실패
// 비번 일치x -> 잘못된 비번