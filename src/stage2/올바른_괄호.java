package stage2;

import java.util.Stack;

public class �ùٸ�_��ȣ {

	public static void main(String[] args) {

		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));

	}

	static boolean solution(String s) {
		boolean answer = true;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else {
				if(stack.isEmpty()) {
					return false;
				} else {
					stack.pop();
				}
			}
		}

		if (stack.isEmpty()) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}

}
