// 문자열 여러번 뒤집기 : 문자열 -> 배열로 만든 후 뒤집고 치환(splice, 뒤집은 문자열로 바꾸기)
function solution(my_string, queries) {
  let myStr = my_string.split(''); // 배열

  for(let query of queries) {
    let [startIndex, lastIndex] = query;
    let targetString = myStr.slice(startIndex,lastIndex+1);
    let reversedString = targetString.reverse();
    myStr.splice(startIndex, targetString.length, ...reversedString); // 새로운 배열반환 
  }
  return myStr.join('');
}


// 👀 배열.splice(start,deleteCount, item1, item2...) : (인덱스시작, 배열에서 제거할요소의수, 배열에 추가할요소) // 원본배열을 수정 반환
// for(let property in object) : property == key / object = key: value 
// 문자열.substr(startIndex,lastIndex) : 문자열 startIndex 부터 lastIndex 전까지의 문자열를 반환 // 배열.reverse() : 배열 뒤집어짐
// slice(start, end) : 인덱스에 해당하는 새로운 문자열, 배열을 반환


// 🤔 문자열로 뒤집기 + 치환 -> 예제는 통과했지만 일부 테스트에서 실패
// function solution(my_string, queries) {
//   let myStr = my_string;
//   for(let query of queries) {
//     let [startIndex, lastIndex] = query;
//     let targetString = myStr.slice(startIndex,lastIndex+1);
//     let reversedString = targetString.split('').reverse().join('');
//     myStr = myStr.replace(targetString,reversedString); // 수정된 문자열을 수정.. 반복하려면, 반복문 안에서 수정하기
//   }
//   return myStr;
// }
