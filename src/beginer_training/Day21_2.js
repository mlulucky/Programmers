function solution(board) {
  let aroundCalc = [[-1, -1], [-1, 0], [-1, 1], [0, -1], [0, 1], [1, -1], [1, 0], [1,1]];
  let bombPosition = [];
  for(let i=0; i<board.length; i++) {
      for(let j=0; j<board[i].length; j++) {
          if(board[i][j] === 1) {
              bombPosition.push([i,j]);
          }
      }
  }
  let bombAreas = new Set();
  bombPosition.forEach(([x,y]) => { 
      bombAreas.add(`${x},${y}`); // 지뢰좌표 포함
      aroundCalc.forEach(([dx, dy]) => { // 지뢰 주변좌표
          let newX = x + dx;
          let newY = y + dy;
          if(newX>=0 && newY>=0 && newX < board.length && newY <board[0].length) {
              bombAreas.add(`${newX},${newY}`);
          }
      });
  });

  return board.length * board[0].length - bombAreas.size;

}







