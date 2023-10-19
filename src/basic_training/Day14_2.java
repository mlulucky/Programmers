package basic_training;

import java.util.ArrayList;

public class Day14_2 {
	public String[] solution(String[] names) {
		ArrayList<String> answer = new ArrayList<>();
		for(int i=0; i<names.length; i++) {
			if(i % 5 == 0) {
				answer.add(names[i]);
			}
		}
		return answer.toArray(new String[0]);
	}
}

// 문제풀이 _ for 반복문 (확실히 빠름 0.02ms)

// 번외 문제풀이 _ IntStream (3ms )
// return IntStream.range(0, names.length).filter(i -> i % 5 == 0).mapToObj(i -> names[i]).toArray(size -> new String[size]);
// 0 부터 names 배열길이까지. 인덱스가 5의 배수인 요소만 남기고. 해당인덱스로 names 배열의 인덱스의 요소를 구한 배열을, 그 배열의 사이즈만큼으로 new String[] 배열 생성

// * answer.toArray(new String[0])
// toArray() 메서드에 빈 배열을 전달하면, 내부적으로 새로운 배열이 생성되어 리스트의 요소들이 배열에 복사된다.
// 적절한 크기의 배열이 자동생성
// answer 리스트의 모든 요소를 새로운 문자열 배열에 복사하여 반환. 필요한 크기만큼 자동할당
// new String[0] 은 크기가 0 이므로 아무 요소도 포함하지 않지만 (반환될 배열의 타입을 지정)

