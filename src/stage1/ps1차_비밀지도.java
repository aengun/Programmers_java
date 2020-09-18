package stage1;

public class ps1차_비밀지도 {

	public static void main(String[] args) {

		int arr1[] = { 9, 20, 28, 18, 11 };
		int arr2[] = { 30, 1, 21, 17, 28 };
		int arr3[] = { 46, 33, 33, 22, 31, 50 };
		int arr4[] = { 27, 56, 19, 14, 14, 10 };
		solution(5, arr1, arr2);
		// solution(6, arr3, arr4);
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			answer[i] = "";
		}

		int modifiedArr1[][] = new int[n][n];
		int modifiedArr2[][] = new int[n][n];
		String s1[] = new String[arr1.length];
		String s2[] = new String[arr1.length];

		for (int i = 0; i < s1.length; i++) {
			s1[i] = getString(arr1[i], n);
			s2[i] = getString(arr2[i], n);
			System.out.println("s1[] : " + s1[i]);
			System.out.println("s2[] : " + s2[i]);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < s1[0].length(); j++) {
				if (s1[i].charAt(j) == '0' && s2[i].charAt(j) == '0') {
					answer[i] = answer[i] + " ";
				} else {
					answer[i] = answer[i] + "#";
				}
			}
		}
		return answer;
	}

	public static String getString(int num, int n) {
		String a = Integer.toBinaryString(num);
		while (a.length() < n) {
			a = "0" + a;
		}
		return a;
	}

}
