package stage2;

public class 다음_큰_숫자 {

	public static void main(String[] args) {
		
		System.out.println(solution(78));
		System.out.println(solution(15));

	}
	
	public static int solution(int n) {
        int answer = 0;
        
        String a = Integer.toBinaryString(n);
        int count1 = countOne(a);
        
        for(int i = n+1; ; i++) {
        	String a2 = Integer.toBinaryString(i);
        	int count2 = countOne(a2);
        	
        	if(count1 == count2) {
        		return i;
        	}
        }
    }
	
	public static int countOne(String a) {
		char[] count = a.toCharArray();
		int countone = 0;
		for(char c : count) {
			if(c == '1') countone++;
		}
		
		return countone;
	}
}
