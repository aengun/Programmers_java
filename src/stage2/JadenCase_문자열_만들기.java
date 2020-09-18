package stage2;

public class JadenCase_문자열_만들기 {

	public static void main(String[] args) {

		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week"));
		System.out.println(solution(" for the last week "));

	}

	public static String solution(String s) {
		String answer = "";
		
		s = s.toLowerCase();

		String arr[] = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()>=1) {
				String a = "" + arr[i].toUpperCase().charAt(0);
				arr[i] = a + arr[i].substring(1);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				answer += arr[i];
			} else {
				answer += arr[i] + " ";
			}
		}
		
		if(s.charAt(s.length()-1) == ' ') {
			answer = answer+" ";
		}
		
		return answer;
	}

}
