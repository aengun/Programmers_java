package stage1;

import java.util.Arrays;
import java.util.Collections;

public class ����_������������_��ġ�ϱ� {

	public static void main(String[] args) {

		
		System.out.println("�� : "+solution(118372));
	}
	
	public static long solution(long n) {
        long answer = 0;
        
        String a = ""+n;
        String[] a1 = new String[a.length()];
        a1 = a.split("");
        Arrays.sort(a1, Collections.reverseOrder());
        for(int i = 0;i <a1.length;i++) {
        	answer += Integer.parseInt(a1[i])*Math.pow(10, a1.length-i-1);
        }
        
        return answer;
    }

}
