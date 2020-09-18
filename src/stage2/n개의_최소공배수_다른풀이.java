package stage2;

public class n개의_최소공배수_다른풀이 {

	public static void main(String[] args) {
		
		int a[] = { 2, 6, 8, 14 };
		int b[] = { 1, 2, 3 };
		int c[] = { 9, 6, 3 };
		System.out.println(solution(a));
		System.out.println(solution(b));
		System.out.println(solution(c));

	}

	public static int solution(int[] arr) {
		
		int answer = 0;

		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result = getLcm(result, arr[i]);
		}
		
		answer = result;

		return answer;
	}

	public static int getGcd(int a, int b) { // 최대공약수
		int tmp;
		while (b != 0) {
			tmp = b;
			b = a % b;
			a = tmp;
		}

		return a;
	}

	static int getLcm(int a, int b) {
		int tmp = a * b / getGcd(a, b);
		return tmp;
	}

}
