package basic_training;

import java.util.Scanner;

public class Day02_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a 문자를 입력해 주세요");
        String a = sc.next();
        System.out.print("b 문자를 입력해주세요");
        String b = sc.next();
        System.out.println(a+b);
        sc.close();
    }
}
