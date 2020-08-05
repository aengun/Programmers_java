package stage1;

public class 문자열을_정수로_바꾸기 {

	public static void main(String[] args) {

		System.out.println(solution("1234"));
		System.out.println(solution("-1234"));

	}

	public static int solution(String s) {
		int answer = 0;
		int multi = 1;
		
		if(s.charAt(0) == '-') {
			multi = -1;
		} else {
			return Integer.parseInt(s);
		}
		
		answer = multi * Integer.parseInt(s.substring(1,s.length()));

		return answer;
	}

}
