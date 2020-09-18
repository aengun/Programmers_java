package stage2;

public class 소수_찾기 {

	public static void main(String[] args) {

		System.out.println(solution("17"));
		System.out.println();
		System.out.println(solution("011"));

	}

	public static int solution(String numbers) {
		int answer = 0;

		String numList[] = numbers.split("");

		int[] arr = new int[numList.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(String.valueOf(numList[i]));
		}

		String a = "011";
		int b = Integer.parseInt(a);
		System.out.println(b);

		for (int i : arr) {
			System.out.println(i);
		}
		return answer;
	}

}
