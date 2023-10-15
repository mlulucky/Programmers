const solution = (num_list, n) => num_list.map((value, index)=> num_list[(index + n) % num_list.length]);


// 번외 문제풀이 _ slice(), 배열.concat(배열)
// let arr = [5,2,1,7,5];
// let n = 3;
// return arr.slice(n).concat(arr.slice(0,n));
// arr.slice(n) : 인덱스 n부터(포함) 마지막 인덱스까지 배열 반환
// arr.slice(0,n) : 인덱스 0 부터 n -1 까지 인덱스 배열 반환