package basic_training;

public class Day08_1 {
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		// && -> 둘중하나라도 false면 false // 둘다 true 면 true, 둘다 false 면 false
		// || -> 둘중하나라도 true면 true
		// x v y -> ||
		// x ∧ y -> &&

		boolean answer = (x1 || x2) && (x3 || x4); // (x1 ∨ x2) ∧ (x3 ∨ x4)
		return answer;
	}
}
