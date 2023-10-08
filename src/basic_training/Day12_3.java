package basic_training;

public class Day12_3 {
	public int[] solution(int[] arr, int[][] intervals) {
		int resultSize = 0;
		for (int[] indexArr : intervals) {
			resultSize += (indexArr[1] - indexArr[0] + 1);
		}
		
		int[] resultArr = new int[resultSize];		
		
		int count = 0;
		for (int[] indexArr : intervals) {
			int a = indexArr[0];
			int b = indexArr[1];
			for(int i=a; i<=b; i++) {
				resultArr[count++] = arr[i];
			}
		}

		return resultArr;
	}
}

// 자바 배열 자르기
// 복사 - copyOf()는 배열 전체, copyOfRange()는 배열 일부를 복사해서 새로운 배열을 만든다.

// for (int[] indexArr : intervals) 반복문을 2번으로 나눈 이유
// for 반복문에서 resultSize가 결정이 되고 그 안에서 resultArr 을 선언을 하는 경우는 반복문이 돌때 마다, 배열도 초기화되서 값이 누적이 안되므로
// 반복문 바깥으로 배열을 선언하고 반복문 안에서는 값을 누적시키는 방법으로 해야 원하는 결과가 나온다.

// 번외 문제풀이 _ ArrayList로 배열요소 추가(일반 for 반복문보다는 속도는 느리다.)
// List<Integer> result = new ArrayList<>();
// for(int[] indexArr : intervals) {
// 		int a = indexArr[0];
// 		int b = indexArr[1];
// 		int[] newArr = Arrays.copyOfRange(arr, a, b+1);

// 	for(int num : newArr) {
// 		result.add(num);
// 	}
// }
// return result.stream().mapToInt(Integer::intValue).toArray();
