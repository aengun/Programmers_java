package stage1;

import java.util.ArrayList;
import java.util.Arrays;

public class K¹øÂ°¼ö {

	public static void main(String[] args) {

		int array[] = { 1, 5, 2, 6, 3, 7, 4 };
		int commands[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		solution(array, commands);

	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = {};

		ArrayList<Integer> num = new ArrayList<>();
		
		for (int i = 0; i < commands.length; i++) {
			int arr2[] = new int[commands[i][1] - commands[i][0] + 1];
			int k = 0;
			for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
				arr2[k] = array[j];
				k++;
			}
			Arrays.sort(arr2);
			num.add(arr2[commands[i][2]-1]);
		}

		answer = new int[num.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		return answer;

	}

}
