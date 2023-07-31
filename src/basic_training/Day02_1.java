package basic_training;

import java.util.Scanner;

public class Day02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in 입력받는 클래스
        System.out.print("정수 a 를 입력해주세요");
        int a = sc.nextInt();
        System.out.print("정수 b 를 입력해주세요");
        int b = sc.nextInt();

        // 문자열 + 정수 + 정수 => 문자열 + "정수" + "정수" (숫자가 문자열로 변환되어 앞의 문자열과 더해진다.) 
        // 문자열 + (정수 + 정수) => 문자열 + "정수" (숫자가 먼저 연산이 된 후에 문자열로 변환되어 앞의 문자열과 더해진다.) // () 괄호 연산이 우선순위
        int result = a + b;
        System.out.println(a + "+" + b + "=" + result);
        sc.close();
    }
}
