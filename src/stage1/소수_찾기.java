package stage1;

public class 소수_찾기 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 5;

		System.out.println(solution(n1));
		System.out.println(solution(n2));

	}

	public static int solution(int n) {
		int answer = 0;
		int root = (int)Math.sqrt(n);
		//System.out.println("root : "+root);

		for (int i = 2; i <= n; i++) {
			boolean check = true;
			for (int j = 2; j*j<=i; j++) { //여기 j<=root로 하면 왜 안될까..
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				answer++;
			}
		}		

		return answer;
	}

}
