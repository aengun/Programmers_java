package stage1;

public class 체육복 {

	public static void main(String[] args) {

		int lost1[] = { 2, 4 };
		int reserve1[] = { 1, 3, 5 };

		int lost2[] = { 2, 4 };
		int reserve2[] = { 3 };

		int lost3[] = { 3 };
		int reserve3[] = { 1 };

		System.out.println("답 : " + solution(5, lost1, reserve1));
		System.out.println("답 : " + solution(5, lost2, reserve2));
		System.out.println("답 : " + solution(3, lost3, reserve3));

	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int arr[] = new int[n + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}

		for (int j : lost) {
			arr[j]--;
		}

		for (int k : reserve) {
			arr[k]++;
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				if (i - 1 >= 1 && arr[i - 1] == 2) {
					arr[i - 1]--;
					arr[i]++;
				} else if (i + 1 <= n && arr[i + 1] == 2) {
					arr[i + 1]--;
					arr[i]++;
				} else {
					continue;
				}
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				answer ++;
			}
		}

		return answer-1;
	}

}
