package stage1;

public class x만큼_간격이_있는_n개의_의자 {

	public static void main(String[] args) {

		System.out.println(solution(2, 5));
		System.out.println(solution(4, 3));
		System.out.println(solution(-4, 2));
	}

	public static long[] solution(int x, int n) {
		long[] answer = {};

		answer = new long[n];
		answer[0] = x;

		for (int i = 1; i < answer.length; i++) {
			answer[i] = answer[i - 1] + x;
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}

		return answer;
	}

}
