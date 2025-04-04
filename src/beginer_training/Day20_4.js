function solution(polynomial) {
  let xSum = 0;
  let numSum = 0;
  
  polynomial.split(' ').forEach(val => {
      if(!isNaN(val)) {
          numSum += Number(val);
      }
      else if(val.includes('x')) {
          val = val === 'x' ? 1 : Number(val.split('x')[0]);
          xSum += val;
      }
  });
  
  if(xSum === 0) return `${numSum}`;
  
  xSum = xSum === 1 ? "x" : xSum + "x";
  
  return numSum === 0 ? xSum : xSum + " + " + numSum;
  
}