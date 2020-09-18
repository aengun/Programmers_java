package stage2;

import java.util.Arrays;

public class 구명보트 {

	public static void main(String[] args) {

		int a[] = { 70, 50, 80, 50 };
		int b[] = { 70, 80, 50 };

		System.out.println(solution(a, 100));
		System.out.println(solution(b, 100));

	}

	public static int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);
		int i = 0;

		for (int j = people.length - 1; j >= i; j--) {
			if (people[i] + people[j] > limit) {
				answer++;
			} else {
				i++;
				answer++;
			}
		}

		return answer;
	}
}
