package basic_training;

import java.util.Scanner;

public class Day02_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n 정수를 입력해주세요");
        int n = sc.nextInt();
        if(n%2 == 0) {
            System.out.println(n + " is event");
        } 
        if(n%2 == 1) {
            System.out.println(n + " is odd");
        }
        sc.close();
    }
}
