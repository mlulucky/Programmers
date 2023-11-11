package basic_training;

public class Day18_3 {
	public int solution(String binomial) {
		int result = 0;
		String[] strArr = binomial.split(" "); // ["a", "+", "b"]
		String op = strArr[1];
		int oneValue = Integer.parseInt(strArr[0]);
		int twoValue = Integer.parseInt(strArr[2]);
		switch (op) {
			case "+":
				result = oneValue + twoValue;
				break;
			case "-":
				result = oneValue - twoValue;
				break;
			case "*":
				result = oneValue * twoValue;
				break;
		}
		return result;
	}
}


// 번외 문제풀이 if 조건문 분기처리
// if(strArr[1].equals("+"))  {
// result = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]);
// }
// if(strArr[1].equals("-"))  {
// result = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
// }
// if(strArr[1].equals("*"))  {
// result = Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[2]);
// }

// 번외 문제풀이 - Arrays.stream()
// if(binomial.contains("+")) { // if(binomial.contains(op)) op 가 + 이면
// 	return Arrays.stream(binomial.split("\\+")).map(String::trim).mapToInt(Integer::parseInt).sum();
// }
// else if(binomial.contains("-")) { 
// 	return Arrays.stream(binomial.split("-")).map(item -> Integer.parseInt(item.trim())).reduce((a,b) -> a - b).orElse(0);
// }
// else if(binomial.contains("*")) {
// 	return Arrays.stream(binomial.split("\\*")).map(item -> Integer.parseInt(item.trim())).reduce((a,b) -> a * b).orElse(0);
// }

// split(" ") 정규표현식 +, * 
// split("\\+"), split("\\*")
// -> 문자로 인식하게 하기 위해 \\ 이스케이프 문자를 붙임

// 배열의 요소를 int 로 바꾸기
// map(item -> Integer.parseInt(item)) == mapToInt(Integer::parseInt)

// 자바 == 연산자
// 객체의 참조가 동일한지 비교
// 문자열.equals("") 
// 문자열 equals 비교의 경우 String 클래스에서 값만을 비교하는걸로 오버라이드 했기때문에. 문자가 동일한지를 비교
// 이외의 경우 equals 는 기본적으로 == 과 동일하게 객체의 참조를 비교한다.

// reduce 메소드 
// 스트림의 모든 요소를 하나의 결과값으로 축소 -> 모든 정수를 더하기

// Integer::sum
// Integer 클래스의 sum 메소드를 참조한 메소드 참조표현식
// 두개의 정수를 받아 그 합을 반환

// reduce(0, Integer::sum)
// 스트림의 모든 요소, 정수를 더하는 연산을 수행