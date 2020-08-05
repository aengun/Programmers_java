package stage1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {

	public static void main(String[] args) {

		String s = "Zbcdefg";
		System.out.println(solution(s));

	}

	public static String solution(String s) {
		String answer = "";

		Character[] arr = new Character[s.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}

		return answer;
	}

}
