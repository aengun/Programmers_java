package stage1;

public class �ڵ���_��ȣ_������ {

	public static void main(String[] args) {

		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));

	}

	public static String solution(String phone_number) {
		String answer = "";

		String arr[] = phone_number.split("");

		for (int i = 0; i < arr.length; i++) {
			if (i >= arr.length - 4) {
				answer += arr[i];
			} else {
				arr[i] = "*";
				answer += arr[i];
			}

		}

		return answer;
	}

}
