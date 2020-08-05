package stage1;

public class 시저_암호 {

	public static void main(String[] args) {

		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));

	}

	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (Character.isLowerCase(c)) {
				c = (char) ((c + n % 26 - 'a') % 26 + 'a');
			} else if (Character.isUpperCase(c)) {
				c = (char) ((c + n % 26 - 'A') % 26 + 'A');
			}
			
			answer += c;

		}

		return answer;
	}

}
