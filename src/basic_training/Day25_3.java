package basic_training;

import java.util.Arrays;

public class Day25_3 {
	public int[][] solution(int[][] arr) {
		int row = arr.length; // 행
		int col = arr[0].length; // 열
		if (row > col) { // 행 > 열
			for (int i = 0; i < arr.length; i++) {
				// 배열길이를 row로 하고, 기존배열 그대로 복사(추가된 열은 0으로)
				arr[i] = Arrays.copyOf(arr[i], row);
			}
		}
		if (col > row) { // 열 > 행
			int[][] list = new int[col][col]; // 열의길이를 가지는 배열생성(기본값 0)
			for (int i = 0; i < arr.length; i++) {
				// 기존 배열을 새로운 배열에 복사
				System.arraycopy(arr[i], 0, list[i], 0, arr[i].length);
			}
			arr = list;
		}
		return arr;
	}
}

// System.arraycopy(데이터를 가져올 원본배열, 원본배열에서 복사를 시작할 위치, 복사 대상배열, 대상배열에서 복사를 시작할 위치, 원본배열에서 가져올 데이터의 길이)
// 예) 원본배열 - [57,192,534,2] / 원본배열에서 가져올길이 2 => [57,192] 배열로 복사가 된다.

// 참고할만한 번외 문제풀이
// int max = Math.max(arr.length, arr[0].length); // row, col 중 큰값을 구한다.
// int[][] array = new int[max][max]; // 큰값의 길이로 2차원 배열을 생성

// for(int i=0; i<arr.length; i++) {
// 	System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
// }
// return array;