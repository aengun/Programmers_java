package stage1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {

	public static void main(String[] args) {

		int[] answers = { 1, 2, 3, 4, 5 };
		solution(answers);

	}

	public static int[] solution(int[] answers) {
		int[] answer = {};
		int[] person1 = { 1, 2, 3, 4, 5 };
		int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] score = { 0, 0, 0 };
		for (int i = 0; i < answers.length; i++) {
			if (person1[i % 5] == answers[i]) {
				score[0]++;
			}
			if (person2[i % 8] == answers[i]) {
				score[1]++;
			}
			if (person3[i % 10] == answers[i]) {
				score[2]++;
			}
		}

		int max = Math.max(score[0], Math.max(score[1], score[2]));

		ArrayList<Integer> totalScore = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			if (max == score[i]) {
				totalScore.add(i + 1);
			}
		}

		answer = new int[totalScore.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = totalScore.get(i);
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		return answer;
	}

}
