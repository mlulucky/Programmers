function solution(dots) {
  const leans = [];

  for (let i = 0; i < dots.length; i++) {
    for (let j = i + 1; j < dots.length; j++) {
      const [x1, y1] = dots[i];
      const [x2, y2] = dots[j];
      const lean = (x1 === x2) ? Infinity : (y2 - y1) / (x2 - x1);

      for (const { lean: preLean, dotsIdx } of leans) {
        if (preLean === lean) {
          const [k, l] = dotsIdx;

          // 겹치지 않는 네 점인지 확인
          const xySet = new Set([k, l, i, j]);
          if (xySet.size === 4) return 1;
        }
      }

      leans.push({ lean, dotsIdx: [i, j] });
    }
  }

  return 0;
}

// dots 좌표배열
// 조합
// 평행(기울기)

// 4개의 점을 동시에 사용하는 경우, 중복되는 점이 발생하는 케이스를 제외해야한다.

