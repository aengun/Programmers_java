package stage1;

public class �ݶ���_���� {

	public static void main(String[] args) {

		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));

	}

	public static int solution(int num) {
		int answer = 0;

		while (num != 1) {

			if (num % 2 == 0) {
				num = num / 2;
			} else if(num%2 == 1){
				num = num * 3 + 1;
			}

			answer++;

			if (answer == 500) {
				return -1;
			}
		}
		
//		int result = num;
//        int count = 0;
//        
//        //�Է°��� 1�̵Ǹ� �ݺ� ����
//        while(result != 1){
//            if(result%2 == 0){    //¦���� ���
//                result = result/2;
//            }else if(result%2 == 1){    //Ȧ���� ���
//                result = (result*3)+1;
//            }
//            count++;    //�õ� Ƚ�� ����
//            
//            //500�� �̻��̸� -1 ��ȯ
//            if(count > 500){
//                count = -1;
//                break;
//            }
//        }
//        return count;

		return answer;
	}

}
