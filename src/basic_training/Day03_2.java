package basic_training;

import java.util.Arrays;
import java.util.Scanner;

public class Day03_2 {
	public static void main(String[] args) {
		// 출력 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력");
		String str = sc.next();
		String[] strArr = new String[str.length()];
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = String.valueOf(str.charAt(i));
		}
		System.out.println("strArr" + Arrays.toString(strArr));
		solution(strArr);
	}

	public static String solution(String[] arr) {
		// 문제 풀이
		StringBuilder sb = new StringBuilder();

		for (String a : arr) {
			sb.append(a);
		}

		return sb.toString();
	}

}
