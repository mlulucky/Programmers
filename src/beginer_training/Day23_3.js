function solution(babbling) { 
  let can = ["aya", "ye", "woo", "ma"];
  
  return babbling.filter((word) => {
      for(let char of can) {
          word = word.split(char).join(' ');
          if(word.trim() === '') return true;
      }
      return false;
  }).length;    

}


// 방법 1.
// let count = 0;
//   for(let word of babbling) {
//       for(let char of can) {
//           word = word.split(char).join(' ');
//           if(word.trim() === '') {
//               count++;
//               break;
//           }
//       }
//   }
//   return count;

// 방법 2.
// let count = 0;
// for(let babble of babbling) { 
//     for(let char of can) { 
//         babble = babble.split(char).join(' '); 
//     }
//     if(babble.trim() === '') count++;
//  }
// return count; 

// continue; // 이건 내부 루프를 계속
// break; // 또는 내부 루프 종료