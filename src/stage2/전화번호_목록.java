package stage2;

import java.util.Arrays;

public class 전화번호_목록 {

	public static void main(String[] args) {

		String a[] = { "119", "97674223", "1195524421" };
		System.out.println(solution(a));
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

//		for (int i = 0; i < phone_book.length; i++) {
//			for (int j = 0; j < phone_book.length; j++) {
//				if (i == j)
//					continue;
//				if(phone_book[j].indexOf(phone_book[i]) == 0)
//					answer = false;
//			}
//		}

//		for(int i = 0;i<phone_book.length-1;i++) {
//			for(int j = i+1;j<phone_book.length;j++) {
//				if(phone_book[i].indexOf(phone_book[j])==0) {
//					answer = false;
//				}
//				if(phone_book[j].indexOf(phone_book[i])==0) {
//					answer = false;
//				}
//			}
//		}

		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length-1; i++) {
			if(phone_book[i+1].indexOf(phone_book[i])==0) {
				answer = false;
			}
		}

		return answer;

	}

}
