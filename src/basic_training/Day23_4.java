package basic_training;

public class Day23_4 {
	public int solution(int a, int b) {
		if(a%2!=0 && b%2!=0) {
		return a*a + b*b;
		}
		else if(a%2==0 && b%2==0) {
		return Math.abs(a-b);
		}
		else {
		return 2*(a+b);
		}
	}
}