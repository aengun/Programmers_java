package stage2;

public class Çà·ÄÀÇ_°ö¼À {

	public static void main(String[] args) {

		int arr1[][] = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		int arr2[][] = { { 3, 3 }, { 3, 3 } };
		int arr3[][] = { { 2, 3, 2 }, { 4, 2, 4 }, { 3, 1, 4 } };
		int arr4[][] = { { 5, 4, 3 }, { 2, 4, 1 }, { 3, 1, 1 } };

		solution(arr1, arr2);
		solution(arr3, arr4);

	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		answer = new int[arr1.length][arr2[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				for (int k = 0; k < arr2[0].length; k++) {
					answer[i][k] += arr1[i][j]*arr2[k][j];
				}
			}
		}

		return answer;
	}

}
