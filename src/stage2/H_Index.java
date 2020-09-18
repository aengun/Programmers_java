package stage2;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {

		int arr[] = { 3, 0, 6, 1, 5 };
		int arr2[] = { 10, 8, 5, 4, 3 };
		int arr3[] = { 25, 8, 5, 3, 3 };
		int arr4[] = { 0, 1, 4, 5, 10, 25, 30 };

		System.out.println(solution(arr));
		System.out.println(solution(arr2));
		System.out.println(solution(arr3));
		System.out.println(solution(arr4));
	}

	public static int solution(int[] citations) {
		int answer = 0;

		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			if (citations[i] >= citations.length-i) {
				answer = citations.length-i;
				break;
			}
		}
		return answer;
	}
}
