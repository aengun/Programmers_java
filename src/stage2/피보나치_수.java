package stage2;

public class 피보나치_수 {

	public static void main(String[] args) {

		System.out.println(solution(3));
		System.out.println(solution(5));

	}

	public static int solution(int n) {
		int answer = 0;

		if (n <= 1) {
			return 1;
		}

		int result0 = 0;
		int result1 = 1;

		for (int i = 1; i < n; i++) {
			answer = result0 + result1;
			answer %= 1234567;
			result0 = result1;
			result1 = answer;
		}
		
		return answer;
		
	}

}
