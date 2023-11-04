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

// 참고할만한 번외문제 풀이 _ substring, startsWith 사용
// int cnt = 0;
// for(int i=0; i<myString.length(); i++) {
// 		if(myString.substring(i).startsWith(pat)){
// 				cnt++;
// 		}
// }
// return cnt;