package stage1;

public class 키패드_누르기 {

	public static void main(String[] args) {

		int arr1[] = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		int arr2[] = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		int arr3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		System.out.println(solution(arr1, "right"));
		System.out.println(solution(arr2, "left"));
		System.out.println(solution(arr3, "right"));

	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int leftPosition = 998;
		int rightPosition = 999;
		int phone[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 998, 0, 999 } };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				leftPosition = numbers[i];
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				rightPosition = numbers[i];
			} else {
				int left = getDistance(leftPosition, numbers[i], phone);
				int right = getDistance(rightPosition, numbers[i], phone);

				if (left < right) {
					answer += "L";
					leftPosition = numbers[i];
				} else if (right < left) {
					answer += "R";
					rightPosition = numbers[i];
				} else {
					if (hand.equals("right")) {
						answer += "R";
						rightPosition = numbers[i];
					} else {
						answer += "L";
						leftPosition = numbers[i];
					}
				}
			}
		}
		return answer;
	}

	public static int getDistance(int position, int location, int phone[][]) {

		int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

		for (int i = 0; i < phone.length; i++) {
			for (int j = 0; j < phone[0].length; j++) {
				if (phone[i][j] == position) {
					x1 = i;
					y1 = j;
				}
				if (phone[i][j] == location) {
					x2 = i;
					y2 = j;
				}
			}
		}
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}

}
