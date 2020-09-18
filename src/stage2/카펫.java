package stage2;

public class Ä«Æê {

	public static void main(String[] args) {

		solution(24, 24);

	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		int x = 0;
		int y = 0;

		for (y = 3; y <= (int) (brown + 4) / 4; y++) {

			x = (brown + yellow) / y;

			if (x < y) {
				break;
			}
			
			int yellowcount = (x-2)*(y-2);

			if (yellow == yellowcount) {
				answer[0] = x;
				answer[1] = y;
				break;
			}
		}
		
		System.out.println(x+","+y);
		

		return answer;
	}

}
