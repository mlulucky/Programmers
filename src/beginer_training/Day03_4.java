package beginer_training;

import java.util.stream.IntStream;

public class Day03_4 {
	public int[] solution(int n){
		return IntStream.rangeClosed(1, n)
		.filter(i -> i%2 !=0)
		.toArray();
	}
}

// 번외 문제풀이
// List<Integer> list = new ArrayList<>();
// for(int i=1; i<=n; i+=2) list.add(i);
// return list.stream().mapToInt(Integer::intValue).toArray();

// IntStream.rangeClosed().filter(i -> i%2 !=0) i 는 스트림 요소의 값
// 메소드 참조 ::
// Integer 객체의 intValue 메소드를 호출해서, Integer 객체를 int 타입으로 변환
