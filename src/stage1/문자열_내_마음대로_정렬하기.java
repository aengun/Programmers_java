package stage1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열_내_마음대로_정렬하기 {

	public static void main(String[] args) {

		String arr1[] = { "sun", "bed", "car" };
		String arr2[] = { "abce", "abcd", "cdx" };

		String arr3[] = solution(arr1, 1);
		String arr4[] = solution(arr2, 1);

		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}

	public static String[] solution(String[] strings, int n) {
		String[] answer = {};

		ArrayList<String> arr = new ArrayList<>();

		for (int i = 0; i < strings.length; i++) {
			arr.add(strings[i].charAt(n) + strings[i]);
		}

		Collections.sort(arr);

		answer = new String[arr.size()];
		for (int i = 0; i < strings.length; i++) {
			answer[i] = arr.get(i).substring(1);
		}

		return answer;
	}

}
