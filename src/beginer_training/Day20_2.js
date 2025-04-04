function solution(keyinput, board) {
    const moveable = board.map(val => Math.floor(val/2));
    const directionMap = {left: [-1,0], right: [1, 0], up: [0,1], down: [0,-1]}

    const init = keyinput.reduce((acc, cur) => {
        const [x, y] = directionMap[cur];
        acc[0] += x;
        acc[1] += y;

        return acc.map((val, idx) => Math.max(-moveable[idx], Math.min(val, moveable[idx])))
    },[0,0]);

    return init;
}

// 다른방법: switch 문
// const moveable = board.map(val => Math.floor(val/2));
//   const init = [0,0];
//   for(let key of keyinput) {
//       switch(key) {
//           case 'left':
//             init[0] = init[0] > -moveable[0] ? init[0] - 1 : -moveable[0];
//             break;
//           case 'right':
//             init[0] = init[0] < moveable[0] ? init[0] + 1 : moveable[0];
//             break;
//           case 'up':
//             init[1] = init[1] < moveable[1] ? init[1] + 1 : moveable[1];
//             break;
//           case 'down':
//             init[1] = init[1] > -moveable[1] ? init[1] - 1 : -moveable[1];
//             break;
//       }
//   }
//     return init;