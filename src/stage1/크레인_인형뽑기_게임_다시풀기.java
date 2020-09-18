package stage1;

import java.util.Stack;

public class 크레인_인형뽑기_게임_다시풀기 {

	public static void main(String[] args) {

		int arr[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } };

		int moves[] = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(solution(arr, moves));

	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> stack = new Stack<>();
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[j][moves[i] - 1] != 0) {// 0이면 통과
					if (stack.isEmpty()) {// stack이 비어있으면 그냥 추가
						stack.push(board[j][moves[i] - 1]);
					} else {
						if (stack.peek() == board[j][moves[i] - 1]) {
							stack.pop();
							answer += 2;
						} else {
							stack.push(board[j][moves[i] - 1]);
						}
					}
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
		
//		for (int i = 0; i < moves.length; i++) {
//			for (int j = 0; j < board.length; j++) {
//				if (board[j][moves[i] - 1] != 0) {
//					if (s.isEmpty())
//						s.push(board[j][moves[i] - 1]);
//
//					else {
//						if (s.peek() == board[j][moves[i] - 1]) {
//							s.pop();
//							answer += 2;
//						} else {
//							s.push(board[j][moves[i] - 1]);
//						}
//					}
//					board[j][moves[i] - 1] = 0;
//					break;
//				}
//			}
//		}
		return answer;
	}

}
