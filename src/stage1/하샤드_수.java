package stage1;

public class ÇÏ»þµå_¼ö {

	public static void main(String[] args) {

		System.out.println(solution(10));
		System.out.println(solution(11));
		System.out.println(solution(12));
		System.out.println(solution(13));

	}

	public static boolean solution(int x) {
		boolean answer = true;

		String a = "" + x;
		String a1[] = a.split("");
		int sum = 0;
		
		for(int i = 0;i <a1.length;i++) {
			sum += Integer.parseInt(a1[i]);
		}
		
		if(x%sum == 0) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}

}
