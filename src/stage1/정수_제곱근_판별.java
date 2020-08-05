package stage1;

public class 정수_제곱근_판별 {

	public static void main(String[] args) {

		System.out.println(solution(121));
		System.out.println(solution(3));
		System.out.println(solution(1));
		System.out.println(solution(16));
		System.out.println(solution(95264));

	}

	public static long solution(long n) {

		long answer = 0;
		double root = Math.sqrt(n);
		int root2 = (int) Math.sqrt(n);
		System.out.println(root);

		if (root == root2) {
			answer = (long)Math.pow(root2+1, 2);
		} else {
			answer = -1;
		}

		return answer;
	}

}
