package basic_training;

import java.math.BigInteger;

public class Day22_2 {
	public String solution(String a, String b) {
		return new BigInteger(a).add(new BigInteger(b)).toString();
	}
}

// BigInteger는 Java에서 사용 가능한 가장 큰 범위의 정수를 다룰 수 있는 클래스 중 하나