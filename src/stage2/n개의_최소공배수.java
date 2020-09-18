package stage2;

import java.util.Arrays;

public class n개의_최소공배수 {

	public static void main(String[] args) {
		int a[] = { 2, 6, 8, 14 };
		int b[] = { 1, 2, 3 };
		int c[] = { 9, 6, 3 };
		System.out.println(solution(a));
		System.out.println(solution(b));
		System.out.println(solution(c));

	}

	public static int solution(int[] arr) {
		int answer = 1;
		Arrays.sort(arr);
		int min = 0;

		exit: 
		for (int i = arr[0]; i >= 1; i--) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % i == 0) {
					if (j != arr.length - 1) {
						continue;
					} else {
						min = i;
						break exit;
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / min;
			answer *= arr[i];
		}

		return answer * min;
	}

}
