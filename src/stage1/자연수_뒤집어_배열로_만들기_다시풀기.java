package stage1;

public class �ڿ���_������_�迭��_�����_�ٽ�Ǯ�� {

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
