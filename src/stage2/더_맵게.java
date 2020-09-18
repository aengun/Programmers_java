package stage2;

import java.util.PriorityQueue;

public class ´õ_¸Ê°Ô {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 9, 10, 12 };
		System.out.println(solution(a, 7));
		int b[] = { 1, 2, 3, 4, 5 };
		System.out.println(solution(b, 3));

	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;
//
//		ArrayList<Integer> al = new ArrayList<>();
//
//		for (int i = 0; i < scoville.length; i++) {
//			al.add(scoville[i]);
//		}
//
//		Collections.sort(al);
//		if (scoville[0] >= K)
//			return 0;
//
//		
//		while (al.size() > 1) {
//
//			Collections.sort(al);
//			if (al.get(0) >= K) {
//				return answer;
//			}
//			System.out.println(al);
//			al.add(al.get(0) + al.get(1) * 2);
//			al.remove(1);
//			al.remove(0);
//			answer++;
//
//		}

		PriorityQueue<Integer> heap = new PriorityQueue<>();

		int s1 = 0, s2 = 0;
		for (int i : scoville) {
			heap.add(i);
		}

		while (heap.peek() < K) {
			if (heap.size() == 1) {
				return -1;
			}

			int a = heap.poll();
			int b = heap.poll();

			heap.add(a + 2 * b);
			
			answer++;
		}

		return answer;
	}

}
