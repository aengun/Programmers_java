package stage1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 실패율_유튜브_ezsw {

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
		int people = stages.length;

		List<Fail> fails = new ArrayList<Fail>();

		for (int i = 1; i <= N; i++) {
			int count = 0;
			for (int j = 0; j < stages.length; j++) {
				if (i == stages[j]) {
					count++;
				}
			}
			double rate = (double) count / people;
			fails.add(new Fail(i, rate));
			people -= count;
		}

		myComparator comp = new myComparator();
		Collections.sort(fails, comp);

		for(int i = 0;i<answer.length;i++) {
			answer[i] = fails.get(i).stage;
		}

		return answer;
	}

}

class Fail {
	int stage;
	double rate;

	Fail(int stage, double rate) {
		this.stage = stage;
		this.rate = rate;
	}
}

class myComparator implements Comparator<Fail> {
	public int compare(Fail o1, Fail o2) {
		if (o1.rate < o2.rate) {
			return 1;
		} else if (o1.rate > o2.rate) {
			return -1;
		} else {
			if (o1.stage > o2.stage) {
				return 1;
			} else
				return -1;
		}
	}
}
