package stage1;

public class �ִ�������_�ּҰ���� {

	public static void main(String[] args) {
		
		System.out.println(solution(3,12));
		System.out.println(solution(2,5));

		
	}
	
	public static int[] solution(int n, int m) {
        int[] answer = {};
        int big = 0;
        int small = 0;
        if(n>=m) {
        	big = n;
        	small = m;
        } else {
        	big = m;
        	small = n;
        }
        
        int max = 0;//�ִ�����
        int min = 0;//�ּҰ����
        
        for(int i = 1;i<=small;i++) {
        	if(big%i == 0 && small%i ==0) {
        		max = i;
        	}
        }
        
        min = n*m/max;
        
        answer = new int[]{max, min};
        
        return answer;
    }

}
