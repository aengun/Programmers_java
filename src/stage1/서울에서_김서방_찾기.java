package stage1;

public class ���￡��_�輭��_ã�� {

	public static void main(String[] args) {

		String[] s = {"Jane", "Kim"};
		System.out.println(solution(s));
	}
	
	public static String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0;i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		answer = "�輭���� "+i+"�� �ִ�";
        	}
        }
        
        return answer;
    }

}
