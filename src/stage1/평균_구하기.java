package stage1;

public class Æò±Õ_±¸ÇÏ±â {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = {5,5};
		System.out.println(solution(a));
		System.out.println(solution(b));

	}
	
	public static double solution(int[] arr) {
        double answer = 0;
        
        for(int i = 0;i<arr.length;i++) {
        	answer += arr[i];
        }
        
        answer = answer/arr.length;
        
        return answer;
    }

}
