package basic_training;

public class Day08_4 {
	public int solution(String number) {
	// 각 자리의 숫자 합을 구한뒤 9로 나눈 나머지 반환!
	String arr[] = number.split(""); // "1234" => [1,2,3,4]
	int answer = 0;
	for(int i=0; i<arr.length; i++) {
		answer += Integer.parseInt(arr[i]);
	}
		return answer % 9 ;
	}

}
