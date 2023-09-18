package basic_training;

public class Day09_2 {
	public String solution(String[] my_strings, int[][] parts) {
		StringBuilder result = new StringBuilder();
		int idx = 0;
		for(int[] intArr : parts) {
			int s = intArr[0];
			int e = intArr[1]; 
			String str = my_strings[idx++];
			result.append(str.substring(s, e+1));
		}		
		return result.toString();
	}
}

// 🌼 번외 문제풀이
// public String solution(String[] my_strings, int[][] parts) {
// 	StringBuilder sb = new StringBuilder();
// 		for (int i = 0; i < my_strings.length; i++) {
// 			sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
// 		}
// 	return sb.toString();
// }