package stage1;

public class 콜라츠_추측 {

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
//        //입력값이 1이되면 반복 종료
//        while(result != 1){
//            if(result%2 == 0){    //짝수일 경우
//                result = result/2;
//            }else if(result%2 == 1){    //홀수일 경우
//                result = (result*3)+1;
//            }
//            count++;    //시도 횟수 증가
//            
//            //500번 이상이면 -1 반환
//            if(count > 500){
//                count = -1;
//                break;
//            }
//        }
//        return count;

		return answer;
	}

}
