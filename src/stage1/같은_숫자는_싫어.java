package stage1;

import java.util.ArrayList;
import java.util.Arrays;

public class 같은_숫자는_싫어 {

	public static void main(String[] args) {

		int[] array = { 1, 1, 3, 3, 0, 1, 1 };
		solution(array);

	}

	public static int[] solution(int[] arr) {
		int[] answer = {};

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				arr[i] = 999;
			}
		}

		ArrayList<Integer> newArray = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 999) {
				newArray.add(arr[i]);
			}
		}

		answer = new int[newArray.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = newArray.get(i);
		}

		return answer;
	}
}
