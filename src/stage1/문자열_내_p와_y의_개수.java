package stage1;

public class ���ڿ�_��_p��_y��_���� {

	public static void main(String[] args) {

		String a = "pPoooyY";
		String b = "Pyy";

		System.out.println(solution(a));
		System.out.println(solution(b));

	}

	static boolean solution(String s) {
		boolean answer = true;

		String newS = s.toLowerCase();

		int countP = 0;
		int countY = 0;
		for (int i = 0; i < s.length(); i++) {
			if(newS.charAt(i) == 'p') {
				countP++;
			} else if(newS.charAt(i) == 'y') {
				countY++;
			}
		}
		
		if(countP == countY) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}

}
