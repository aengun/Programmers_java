package stage1;

public class 가운데_글자_가져오기 {

	public static void main(String[] args) {

		String a = "abcde";
		String b = "qwer";

		String as = solution(a);
		String bs = solution(b);

		System.out.println(as);
		System.out.println(bs);

	}

	public static String solution(String s) {
		String answer = "";
		int number = s.length();
		if (number % 2 != 0) {
			answer = s.substring((number+1)/2-1,(number+1)/2);
		} else {
			answer = s.substring(number/2-1,number/2+1);
		}

		return answer;
	}

}
