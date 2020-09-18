package stage2;

import java.util.ArrayList;

public class 기능개발 {

	public static void main(String[] args) {

		int arr1[] = { 93, 30, 55 };
		int arr2[] = { 1, 30, 5 };

		solution(arr1, arr2);

	}

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		int[] count = new int[progresses.length];

		for (int i : count) {
			count[i] = 0;
		}

		for (int i = 0; i < progresses.length; i++) {
			while (progresses[i] < 100) {
				progresses[i] += speeds[i];
				count[i]++;
			}
		}

		ArrayList<Integer> al = new ArrayList<>();
		int day = count[0];
		int countNum = 1;
		for (int i = 1; i < count.length; i++) {
			if (day >= count[i]) {
				countNum++;
			} else {
				day = count[i];
				al.add(countNum);
				countNum = 1;
			}
			if(i == count.length-1) {
				al.add(countNum);
			}
		}
		
		answer = new int[al.size()];
		
		for(int i = 0;i<answer.length;i++) {
			answer[i] = al.get(i);
		}

		return answer;
	}

}
