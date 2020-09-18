package stage2;

public class 멀쩡한_사각형 {

	public static void main(String[] args) {

		long answer = solution(8, 12);
		System.out.println(answer);
		System.out.println();

		long answer2 = solution(63, 35);
		System.out.println(answer2);

	}

	public static long solution(int w, int h) {
		long answer = 1;
		
		long lw = (long) w;
		long lh = (long) h;

		if (lh > lw) {
			long tmp = lh;
			lh = lw;
			lw = tmp;
		}

		long g = getGCD(lw, lh);
//		System.out.println(g);

		answer = lw * lh - (lw + lh - g);

		return answer;
	}

	public static long getGCD(long a, long b) {
		while (b > 0) {
			long tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}

}
