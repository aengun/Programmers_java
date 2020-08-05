package stage1;

public class 자릿수_더하기 {

	public static void main(String[] args) {

		System.out.println(solution(123));
		System.out.println(solution(987));
		System.out.println(solution(100));

	}

	public static int solution(int n) {
		int answer = 0;

		while (n >= 10) {
			int remain = n % 10;
			answer += remain;
			n = n / 10;
		}

		answer += n;

		return answer;
	}

}
