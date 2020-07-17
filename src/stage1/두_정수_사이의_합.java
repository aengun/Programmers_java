package stage1;

public class 두_정수_사이의_합 {

	public static void main(String[] args) {

		long num1 = solution(3, 5);
		long num2 = solution(3, 3);
		long num3 = solution(5, 3);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

	public static long solution(int a, int b) {
		long answer = 0;

//		int tmp = 0;
//
//		if (a > b) {
//			tmp = a;
//			a = b;
//			b = tmp;
//		} else if(a == b) {
//			return a;
//		}
//		
//		int sum = 0;
//		for (int i = a; i <= b; i++) {
//			sum += i;
//		}
		
		
		if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		}

		return answer;
	}

}
