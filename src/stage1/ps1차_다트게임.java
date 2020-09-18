package stage1;

import java.util.StringTokenizer;

public class ps1차_다트게임 {

	public static void main(String[] args) {

		System.out.println(solution("1S2D*3T"));
		System.out.println(solution("1D2S#10S"));
		System.out.println(solution("1D2S0T"));
		System.out.println(solution("1S*2T*3S"));
		System.out.println(solution("1D#2S*3S"));
		System.out.println(solution("1T2D3D#"));
		System.out.println(solution("1D2S3T*"));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		int flag = -1;
		int score[] = new int[3];

		char arr[] = dartResult.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				flag++;
				score[flag] = arr[i]-'0';
				if (arr[i] == '1' && arr[i + 1] == '0') {
					i++;
					score[flag] = 10;
				}
			} else if (arr[i] == 'S') {
				score[flag] = score[flag];
			} else if (arr[i] == 'D') {
				score[flag] = score[flag] * score[flag];
			} else if (arr[i] == 'T') {
				score[flag] = score[flag] * score[flag] * score[flag];
			} else if (arr[i] == '*') {
				if (flag > 0) {
					score[flag - 1] *= 2;
				}
				score[flag] *= 2;
			} else if (arr[i] == '#') {
				score[flag] *= -1;
			}
		}

		for (int i : score) {
			answer += i;
		}

		return answer;
	}

}
