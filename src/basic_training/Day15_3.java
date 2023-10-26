package basic_training;

public class Day15_3 {
	public int solution(int[] num_list) {
		int count = 0;
		for(int num : num_list) {
			while(num != 1) {
				if(num % 2 == 0) num /= 2;
				else num = (num -1) / 2 ; 
				count++;
			}
		}
		return count;
	}
}

// while(조건식) 반복문
// 조건식이 true 일때만 반복문 실행

// for() 반복문
// for(int i=0; i<num_list.length; i++) {
// 	while(num_list[i] != 1) { // 원소의 값이 1 이 아닌경우 반복문 실행 (1인 경우 실행x)
// 		if(num_list[i] % 2 == 0) num_list[i] /= 2;
// 		else if(num_list[i] % 2 == 1) num_list[i] = (num_list[i] - 1) / 2;
// 		count++;
// 	}
// }