package stage1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ½ÇÆÐÀ² {

	public static void main(String[] args) {

		int arr1[] = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int arr2[] = { 4, 4, 4, 4, 4 };

		solution(5, arr1);
		System.out.println();
		solution(4, arr2);

	}

	public static int[] solution(int N, int[] stages) {

		int[] answer = new int[N];

		Arrays.sort(stages);

		HashMap<Integer, Float> hash = new HashMap<>();

		int people = stages.length;
		for (int i = 1; i <= N; i++) {
			int count = 0;
			for (int j = 0; j < stages.length; j++) {
				if (stages[j] == i) {
					count++;
				}
			}
			float percentage = (float) count / people;
			System.out.println(i + " " + percentage);
			
			people = people - count;
		}
		
		List<Integer> list = new ArrayList<>(hash.keySet());
		
		
		
		return answer;
	}


}
