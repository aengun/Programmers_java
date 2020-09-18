package stage2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 스킬트리 {

	public static void main(String[] args) {

		String skill = "CBD";
		String tree[] = { "BACDE", "CBADF", "AECB", "BDA", "ACBD" };

		System.out.println(solution(skill, tree));

	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		String[] skillArray = skill.split("");
		// System.out.println(Arrays.toString(skills));
		
		for (int i = 0; i < skill_trees.length; i++) {
			
		}

		return answer;
	}

}
