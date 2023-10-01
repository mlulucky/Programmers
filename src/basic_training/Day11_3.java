package basic_training;

import java.util.ArrayList;
import java.util.List;

public class Day11_3 {
	public String solution(String my_string, int[] indices) {
		StringBuilder sb = new StringBuilder();
		List<Integer> intArr = new ArrayList<>();
		for(int idx : indices) {
			intArr.add(idx);
		}
		for(int i=0; i<my_string.length(); i++){
			if(!intArr.contains(i)) { 
				sb.append(my_string.charAt(i));
			}
		}	
		String answer = sb.toString();
		return answer;
	}
}

// 🍒 자바 List배열 contains() 메서드
// List 클래스에서 제공하는 contains() 메서드. 배열에 특정 값이 존재하는지 확인하는 법

// 🍉 참고할 만한 번외 문제풀이
//  StringBuilder sb = new StringBuilder(my_string);
// 	for (int i : indices) {
// 			sb.setCharAt(i, ' ');
// 	}
// 	return sb.toString().replace(" ", "");

// 🍉 참고할 만한 번외 문제풀이
// String[] str = my_string.split("");
// for (int i=0;i<indices.length;i++) str[indices[i]] = "";
// return String.join("",str);

// String.join() 예시
// String[] arr = {"", "", "b", "na", "na"};
// String result = String.join("", arr); // arr 배열의 빈문자열과 arr 배열요소를 문자열로 합치는것
// System.out.println(result); // 출력: "bnana"