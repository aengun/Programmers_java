package stage1;

import java.util.ArrayList;

public class 제일_작은_수_제거하기 {

	public static void main(String[] args) {

		int a1[] = { 4, 3, 2, 1 };
		int a2[] = { 10 };
		System.out.println(solution(a1));
		System.out.println(solution(a2));

	}

	public static int[] solution(int[] arr) {
		int[] answer = {};
		int min = 999999;
		int tmp = 0;

		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (min >= arr[i]) {
					min = arr[i];
					tmp = i;
				}
			}
		}

		ArrayList<Integer> arr2 = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (i == tmp) {
				continue;
			} else {
				arr2.add(arr[i]);
			}
		}

		answer = new int[arr2.size()];
		for (int i = 0; i < arr2.size(); i++) {
			answer[i] = arr2.get(i);
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}

		return answer;
	}

}
