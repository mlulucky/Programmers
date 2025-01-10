function solution(friends, gifts) {
	const rows = friends.length;
	const friendsCombi = new Array(rows).fill(0).map(() => new Array(rows).fill(0)); // 선물 주고받은 친구 -> 2차원 배열 초기화 0 
	const giftScores = new Array(rows).fill(0); // 선물지수 배열

	// 선물목록 -> 친구의 인덱스확인 가능(indexOf) -> 1) 2차원 배열 값 대입가능 2) 선물지수 계산가능
	for (const gift of gifts) {
		const [giver, receiver] = gift.split(" "); // [muzi, frodo]
		const giverIndex = friends.indexOf(giver);
		const receiverIndex = friends.indexOf(receiver);

		// 2차원 배열 값 대입
		friendsCombi[giverIndex][receiverIndex] += 1;

		// 선물지수 계산가능
		giftScores[giverIndex]++;
		giftScores[receiverIndex]--;
	}

	// 다음달 선물 받을 개수 계산 (2차원 배열을 탐색해야함)
	// <조건>
	// 1. 선물을 더 많이 준 사람이 선물을 하나 받는다.
	// 2. 선물을 주고받은 수가 같은 경우(또한 기록이 없는 경우) -> 선물지수가 큰사람이 선물을 하나 받는다.

	const nextMonthGifts = new Array(rows).fill(0); // 선물을 받는 개수 결과

	for (let i = 0; i < friends.length; i++) {
		for (let j = 0; j < friends.length; j++) {
			if(i === j) continue;
			if (friendsCombi[i][j] === friendsCombi[j][i]) {
				if(giftScores[i] > giftScores[j]) {
					nextMonthGifts[i]++;
				} else if (giftScores[j] > giftScores[i]) {
					nextMonthGifts[j]++;
				}
			} else if (friendsCombi[i][j] > friendsCombi[j][i]) { // friendsCombi[i][j] : i 가 j 한테 선물준 개수 / friendsCombi[j][i]: j 가 i 한테 선물준 개수
				nextMonthGifts[i]++;
			} else {
				nextMonthGifts[j]++;
			}
		}

	} 

	return Math.max(...nextMonthGifts);
}