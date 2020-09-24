package stage2;

public class ps124³ª¶ó {

	public static void main(String[] args) {

		System.out.println(solution(1));
		System.out.println();
//		System.out.println(solution(2));
//		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println();
		System.out.println(solution(9));
		System.out.println();
	}

	static String solution(int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder();

		int rest = 0;
		while (n > 0) {
			rest = n % 3;
			n = n / 3;
			if (rest == 0) {
				n -= 1;
				rest = 4;
			}
			sb.append(rest);
		}
		
		answer = sb.reverse().toString();
		return answer;
	}

}
