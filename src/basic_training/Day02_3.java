package basic_training;

import java.util.Scanner;

public class Day02_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a 문자를 입력해주세요");
        String str = sc.next();
        if(str.length()>=1 && str.length()<=10) {
            for(int i=0; i<str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }
        sc.close();
    }

}
