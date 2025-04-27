function solution(my_string) {
  return my_string.split(/[a-zA-Z]/).reduce((acc, cur) => {
      acc += Number(cur);
      return acc;
  } ,0);
}