package stage1;

import java.util.ArrayList;

public class 자연수_뒤집어_배열로_만들기 {

	public static void main(String[] args) {

		System.out.println(solution(12345));
		System.out.println();
		System.out.println(solution(500));
		System.out.println();
		System.out.println(solution(2));
		System.out.println();
		System.out.println(solution(48568));

	}

	public static int[] solution(long n) {
		int[] answer = {};

		ArrayList<Integer> arr = new ArrayList<>();

		while (n >= 0) {
			if(n==0) {
				break;
			}
			int k = (int) n % 10;
			arr.add(k);
			n /= 10;

		}

		answer = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
		
//		for(int i = 0;i<arr.size();i++) {
//			System.out.print(arr.get(i)+" ");
//		}
		for(int i = 0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}

		return answer;
	}

} // 왜 틀리지?????
