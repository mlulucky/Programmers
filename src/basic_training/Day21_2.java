package basic_training;

import java.util.Arrays;

public class Day21_2 {
	public int solution(int[] rank, boolean[] attendance) {
		int[] arr = new int[3];
		int count = 0;
		int[] copyRank = Arrays.copyOf(rank, rank.length);
		Arrays.sort(rank);
		for (int i = 0; i < rank.length; i++) {
			int idx = findIndex(copyRank, rank[i]);
			if (attendance[idx]) {
				arr[count++] = rank[i];
			}
			if (count == 3)
				break;
		}
		int result = findIndex(copyRank, arr[0]) * 10000 + findIndex(copyRank, arr[1]) * 100 + findIndex(copyRank, arr[2]);
		return result;
	}

	public int findIndex(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

}

// 1. 오름차순 정렬
// 2. 배열 원소의 인덱스 구하기
// 3. 해당 인덱스로 attendance의 값이 true 인지 false 인지
// 4. 오름차순 배열의 attendance[i] 가 true 인 값을 3개 담기
// 배열의 arr[0] * 10000 + arr[1] * 100 + arr[2] 값을 return 하기

// 😵 참고할만한 번외 문제풀이 _ IntStream
// IntStream.range(0, rank.length).filter(i -> attendance[i]) // ->
// attendance[i] 가 true 인 인덱스만 필터링
// .boxed() // -> IntStream 을 Integer 스트림으로 변환
// .sorted(Comparator.comparing(i->rank[i])) // -> rank 배열 기준으로 정렬
// .limit(3L) // -> 상위 3개 요소 선택
// .reduce((acc, cur) -> acc * 100 + cur)
// .get();

// 😵 참고할만한 번외 문제풀이 _ PriorityQueue
// PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] -
// rank[b]);for(
// int i = 0;i<attendance.length;i++)
// {
// if (attendance[i])
// que.add(i); // -> 참석한 학생의 인덱스를 우선순위 큐에 추가
// }

// return que.poll()*10000+que.poll()*100+que.poll(); // 우선순위 큐에서 가장 작은 등수(가장 높은
// 순위)부터 순서대로 추출하여 결과를 계산
// PriorityQueue를 사용하면 등수를 정렬하는 작업이 내부에서 자동으로 처리되므로 개발자가 직접 정렬에 신경쓸 필요가 없음.

// 😵 참고할만한 번외 문제풀이 _ TreeMap
// TreeMap<Integer, Integer> tree = new TreeMap<>();
// for (int i = 0; i < rank.length; i++) {
// 		if (attendance[i] == true) tree.put(rank[i], i); 
// -> rank 배열을 key 로 하고 , 참석여부가 true 인 학생의 인덱스를 value 로 하는 Map 생성
// }

// ArrayList<Integer> list = new ArrayList<>();
// for (Integer key : tree.keySet()) {
// 		if (list.size() == 3) break;
// 		list.add(tree.get(key)); 
// }
// -> TreeMap 에서 등수 기준으로 정렬된 순서대로  상위 3개 학생 선택

// return list.get(0) * 10000 + list.get(1) * 100 + list.get(2);
// -> 선택된 학생의 등수를 이용하여 결과 계산


// 😵 참고할만한 번외 문제풀이 _ HashMap
// int ans = 0, cnt = 0, r = 1;
// int[] abc = new int[3];
// HashMap<Integer,Integer> m = new HashMap<>();
// for(int i=0 ; i<rank.length ; i++)
// 	m.put(rank[i],i);
// -> key 는 등수, value 는 등수의 index
// -> 🐥HashMap 에 저장될때 순서대로 저장되므로, 오름차순 정렬작업 필요X

// while(cnt<3){
// 	if(attendance[m.get(r)])
// 			abc[cnt++] = m.get(r);
// 	r++;
// }
// -> 등수를 기준 오름차순으로 순회하면서 3명 학생을 선택

// return abc[0]*10000 + abc[1]*100 + abc[2];
// -> 선택된 학생의 등수를 이용하여 결과를 계산