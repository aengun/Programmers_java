package stage1;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {

	public static void main(String[] args) {

		int arr1[] = { 5, 9, 7, 10 };
		int arr2[] = { 2, 36, 1, 3 };
		int arr3[] = { 3, 2, 6 };

		int num1[] = solution(arr1, 5);
		int num2[] = solution(arr2, 1);
		int num3[] = solution(arr3, 10);

		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));

	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		ArrayList<Integer> number = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				number.add(arr[i]);
			}
		}
		
		if(number.size()==0) {
			number.add(-1);
		}
		
		answer = new int[number.size()];
		
		for(int i =0;i<answer.length;i++) {
			answer[i] = number.get(i);
		}
		
		Arrays.sort(answer);
		
		return answer;
	}

}
