package beginer_training;

public class Day02_3 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		numer1 *= denom2;
		numer2 *= denom1;
		answer[0] = numer1 + numer2;
		answer[1] = denom1 * denom2;

		int c = 최대공약수(answer[0], answer[1]);
		if (c > 1) {
			answer[0] /= c;
			answer[1] /= c;
		}
		return answer;
	}

	public int 최대공약수(int a, int b) {
		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
}

// 분수더하기(공통) : 분모끼리 곱하기, 분자끼리 곱하기
// 최대공약수가 1보다 큰 경우. 분모,분자 최대공약수로 나누기
