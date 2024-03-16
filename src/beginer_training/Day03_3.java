package beginer_training;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Day03_3 {
	public int solution(int[] array) {
				int count =0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
				
				int maxFrequency = Collections.max(map.values());			
				int maxKey = 0;
				for(Map.Entry<Integer, Integer> m : map.entrySet()) {
					if(m.getValue() == maxFrequency) {
						count++;
						maxKey = m.getKey();
					}
				}
				return count > 1 ? -1 : maxKey;
    }
}
