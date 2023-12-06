package basic_training;

public class Day23_5 {
	public int solution(int[] date1, int[] date2) {
		int d1 = func(date1);
		int d2 = func(date2);
		return d1 - d2 < 0 ? 1 : 0;
	}

	public int func(int[] arr) {

		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(a);
		}
		return Integer.parseInt(sb.toString());
	}
}
// 합쳐서 결과를 연산하여 비교하기

// 참고할만한 번외 문제 풀이 _ LocalDate
// LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
// LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
// return dateA.isBefore(dateB) ? 1 : 0;

// 참고할만한 번외 문제풀이 _ Arrays.compare
// return Arrays.compare(date1, date2) < 0 ? 1 : 0;


