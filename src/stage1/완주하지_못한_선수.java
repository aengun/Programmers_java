package stage1;

import java.util.Arrays;

public class ��������_����_���� {

	public static void main(String[] args) {
		
		String a[] = { "leo", "kiki", "eden" };
		String b[] = { "eden", "kiki" };
		solution(a, b);

	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i = 0;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				
				return participant[i];
			}
		}
	
		answer = participant[participant.length-1];
       
        return answer;
    }
	
	

}
