package stage1;

public class Â¦¼ö¿Í_È¦¼ö {

	public static void main(String[] args) {

		System.out.println(solution(3));
		System.out.println(solution(4));

	}

	public static String solution(int num) {
		String answer = "";
		
		if(num%2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		
		return answer;
	}
}
