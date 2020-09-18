package stage1;

public class 자연수_뒤집어_배열로_만들기_다시풀기 {

	public static void main(String[] args) {

		solution(12345);

	}

	public static int[] solution(long n) {
		int[] answer = {};
		String a = "" + n;

		String b[] = a.split("");

		answer = new int[b.length];
		for (int i = 0; i<b.length; i++) {
			answer[i] = Integer.parseInt(b[b.length-i-1]);
		}

		return answer;
	}

}
