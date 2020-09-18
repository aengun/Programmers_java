package stage1;

import java.util.Arrays;

public class ¿¹»ê {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 2, 5, 4 };
		int arr2[] = { 2, 2, 3, 3 };

		System.out.println(solution(arr1, 9));
		System.out.println(solution(arr2, 10));
	}

	public static int solution(int[] d, int budget) {

		int answer = 0;

		Arrays.sort(d);
		int sum = 0;

		for (int i = 0; i < d.length; i++) {
			sum += d[i];
			if (sum <= budget) {
				answer++;
			} else {
				return answer;
			}
		}

		return answer;
	}

}
