package stage2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {

	public static void main(String[] args) {

		int a[] = { 6, 10, 2 };
		int b[] = { 3, 30, 34, 5, 9 };

		System.out.println(solution(a));
		System.out.println(solution(b));

	}

	public static String solution(int[] numbers) {
		String answer = "";

		String k[] = new String[numbers.length];
		for (int i = 0; i < k.length; i++) {
			k[i] = ""+numbers[i];
		}
		
		Arrays.sort(k, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
			
		});
		
		for(int i = 0;i<k.length;i++) {
			answer += k[i];
		}
		
		if(answer.charAt(0) == '0') {
			answer = "0";
		}

		return answer;
	}

}
