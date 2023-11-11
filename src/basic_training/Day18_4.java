package basic_training;

public class Day18_4 {
	public int solution(String myString, String pat) {
		String str = myString.replace("A", "C").replace("B","A").replace("C", "B");
		return str.contains(pat) ? 1 : 0;
	}
}

// "ABAB" -> "BABA" 바꾸려면
// A -> C, B -> A, C -> B
// "CBCB" -> "CACA" -> "BABA"


