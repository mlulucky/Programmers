package basic_training;

import java.util.ArrayList;

public class Day17_3 {
	public String[] solution(String[] strArr) {
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<strArr.length; i++) {
			if(!strArr[i].contains("ad")) list.add(strArr[i]);
		}
		return list.toArray(new String[0]);
	}
}

// 참고할만한 번외 문제풀이
// return Arrays.stream(strArr).filter(value -> !value.contains("ad")).toArray(String[]::new);

// toArray 메서드 - 스트림을 다시 배열로 변환
// .toArray(String[]::new) // String[]::new 는 메서드 참조, 새로운 String 배열을 생성하는 생성자 참조

// 자바버전 8 이전
// toArray(new String[0])
// 빈배열을 매개변수로 받고, 배열 요소개수를 확인, 새로운 배열을 할당(요소복사) -> 배열을 두번할당하게됨

// 자바버전 8 이후
// toArray(String[]::new)
// 스트림의 크기를 미리 알고있어, 한번에 적절한 크기배열 할당 -> 효율적. 성능상이점