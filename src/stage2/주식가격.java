package stage2;

public class �ֽİ��� {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2, 3 };
		solution(a);

	}

	public static int[] solution(int[] prices) {
		int[] answer = {};
		answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				answer[i]++;
				if (prices[i] <= prices[j]) {
					continue;
				} else {
					break;
				}
			}
		}

		for (int i : answer) {
			System.out.println(i);
		}

		return answer;
	}

}
