package stage1;

public class ps2016³â {

	public static void main(String[] args) {

		String answer = solution(5, 24);
		System.out.println(answer);

	}

	public static String solution(int a, int b) {
		String answer = "";

		int days = 0;
		if (a == 1) {
			days = days + (b - 1);
		} else {
			for (int i = 1; i < a; i++) {
				switch (i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					days += 31;
					break;

				case 4: case 6: case 9: case 11:
					days += 30;
					break;

				case 2:
					days += 29;
					break;
				}
			}
			days = days + (b - 1);
		}

		if (days % 7 == 0) {
			answer = "FRI";
		} else if (days % 7 == 1) {
			answer = "SAT";
		} else if (days % 7 == 2) {
			answer = "SUN";
		} else if (days % 7 == 3) {
			answer = "MON";
		} else if (days % 7 == 4) {
			answer = "TUE";
		} else if (days % 7 == 5) {
			answer = "WED";
		} else if (days % 7 == 6) {
			answer = "THU";
		}

		return answer;
	}

}
