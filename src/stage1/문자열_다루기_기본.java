package stage1;

public class 문자열_다루기_기본 {

	public static void main(String[] args) {
		
		String s = "a123";
		String s2 = "1234";
		
		System.out.println(solution(s));
		System.out.println(solution(s2));

	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        
        int num = s.length();
        boolean isNum = true;
        char tmp;
        
        for(int i = 0;i < num;i++) {
        	tmp = s.charAt(i);
        	if('0'<=tmp && tmp<='9') {
        		continue;
        	} else {
        		return false;
        	}
        }
        
        if((num==4||num==6)) {
        	answer = true;
        } else {
        	answer = false;
        }
        
        return answer;
    }

}
