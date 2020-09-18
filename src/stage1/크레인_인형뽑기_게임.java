package stage1;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {

	public static void main(String[] args) {

		int arr[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 }, };

		int moves[] = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(solution(arr, moves));

	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < moves.length; i++) {
			answer = move(board, stack, moves[i], answer);
//			for (int j = 0; j < board[0].length; j++) {
//				if (board[j][moves[i] - 1] != 0) {// 0이면 스킵, 가장 위에 있는 인형을 가져와 스택에 저장 및 삭제
//					if (stack.isEmpty()) {
//						stack.add(board[j][moves[i] - 1]);
//						board[j][moves[i] - 1] = 0;
//					} else if (stack.peek() == board[j][moves[i] - 1]) {
//						stack.pop();
//						answer += 2;
//						board[i][moves[i] - 1] = 0;
//						break;
//					} else {
//						stack.add(board[j][moves[i] - 1]);
//						board[j][moves[i] - 1] = 0;
//						break;
//					}
//				} else
//					continue;
//			}
//
		}

		return answer;
	}

	static int move(int[][] board, Stack<Integer> stack, int k, int answer) {
		for (int i = 0; i < board[0].length; i++) {
			if (board[i][k - 1] != 0) {// 0이면 스킵, 가장 위에 있는 인형을 가져와 스택에 저장 및 삭제
				if (stack.isEmpty()) {
					stack.add(board[i][k - 1]);
					System.out.println(stack);
				} else if (stack.peek() == board[i][k - 1]) {
					stack.pop();
					answer += 2;
					System.out.println(stack);
					return answer;
				} else {
					stack.add(board[i][k - 1]);
					System.out.println(stack);
					break;
				}
			}
		}
		return answer;
	}

}
