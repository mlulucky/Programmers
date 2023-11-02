package basic_training;

public class Day17_2 {
	public int solution(String myString, String pat) {
		int count = 0;
		for (int i = 0; i <= myString.length() - pat.length(); i++) {
			if (myString.substring(i, pat.length() + i).equals(pat)) {
				count++;
			}
		}
		return count;
	}
}
