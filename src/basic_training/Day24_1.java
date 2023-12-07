package basic_training;

public class Day24_1 {
	public int solution(String[] order) {
		int price = 0;
		for(String menu : order) {
			price += (menu.contains("americano") || menu.contains("anything")) ? 4500 : 5000;
		}
		return price;
	}
}
