package stage2;

public class 숫자의_표현 {

	public static void main(String[] args) {

		System.out.println(solution(15));

	}

	public static int solution(int n) {
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) {
				if (sum < n) {
					sum += j;
				} else if (sum == n) {
					answer++;
					sum = 0;
					break;
				} else {
					sum = 0;
					break;
				}
			}
		}

		return answer+1;
	}

}
