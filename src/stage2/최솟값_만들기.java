package stage2;

import java.util.Arrays;
import java.util.Collections;

public class 최솟값_만들기 {

	public static void main(String[] args) {
		int a[] = {1,4,2};
		int b[] = {5,4,4};
		
		int a2[] = {1,2};
		int b2[] = {3,4};
		
		System.out.println(solution(a,b));
		System.out.println(solution(a2,b2));
	}

	public static int solution(int[] A, int[] B) {
		int answer = 0;

		Arrays.sort(A);
		Arrays.sort(B);
//		Arrays.sort(B, Collections.reverseOrder()); // int가 아니라 Integer형만 collections.reverseorder을 사용할 수 있다.

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length - i - 1];
		}

		return answer;
	}

}
