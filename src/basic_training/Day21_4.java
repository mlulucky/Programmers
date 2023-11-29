package basic_training;


public class Day21_4 {
    public int solution(String num_str) {
        return num_str.chars().map(Character::getNumericValue).reduce(0,Integer::sum);
    }
}

// "123".split("") -> String[] 배열 ["1","2","3"]
// "123".toCharArray() -> char[] 배열 ['1','2','3']
// "" 큰따옴표는 문자열, '' 작은따옴표는 char열

// 🤔참고할만한 번외 문제풀이
//int answer =0;
//String[] numArr = num_str.split("");
//for(String num : numArr) {
//    answer+=Integer.parseInt(num);
//}
//return answer;

// 🤔참고할만한 번외 문제풀이
//return Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();