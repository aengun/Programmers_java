package stage1;

public class Çà·ÄÀÇ_µ¡¼À {

	public static void main(String[] args) {

		int a[][] = { { 1, 2 }, { 2, 3 } };
		int a2[][] = { { 3, 4 }, { 5, 6 } };
		int b[][] = { { 1 }, { 2 } };
		int b2[][] = { { 3 }, { 4 } };

		System.out.println(solution(a, a2));
		System.out.println(solution(b, b2));

	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		
		answer = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return answer;
	}

}
