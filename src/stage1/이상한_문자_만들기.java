package stage1;

public class �̻���_����_����� {

	public static void main(String[] args) {

		System.out.println(solution("try hello world"));

	}

	public static String solution(String s) {
		String answer = "";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(" ")) { //���� == ���� �ϸ� �� Ʋ��
				answer += s.substring(i, i + 1);
				count = 0;
			} else {
				if (count % 2 == 0) {
					answer += s.substring(i, i + 1).toUpperCase();
				} else {
					answer += s.substring(i, i + 1).toLowerCase();
				}
				count++;
			}
		} 

		return answer;
	}

}
