package basic_training;

<<<<<<< HEAD
public class Day04_2 {
    public int solution(int number, int n, int m) {
=======
import java.util.Scanner;

public class Day04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number 를 입력해주세요");
        int number = sc.nextInt();
        System.out.print("n 를 입력해주세요");
        int n = sc.nextInt();
        System.out.print("m 를 입력해주세요");
        int m = sc.nextInt();
        solution(number, n, m);
    }
    public static int solution(int number, int n, int m) {
>>>>>>> a19feb4 (공배수)
        int answer = 0;
        if(number % n == 0 && number % m == 0) {
            answer = 1;
        }
<<<<<<< HEAD
=======
       System.out.println("answer " + answer);
>>>>>>> a19feb4 (공배수)
        return answer;
    }
}
