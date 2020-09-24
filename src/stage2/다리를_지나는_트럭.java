package stage2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {

	public static void main(String[] args) {

		int a[] = { 7, 4, 5, 6 };
		int b[] = { 10 };
		int c[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println(solution(2, 10, a));
//		System.out.println(solution(100, 100, b));
//		System.out.println(solution(100, 100, c));

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		Queue<Truck> waiting = new LinkedList<>();
		for (int i = 0; i < truck_weights.length; i++) {
			Truck t = new Truck(truck_weights[i], 0);
			waiting.add(t);
		}

		Queue<Truck> bridge = new LinkedList<>();

		int nowWeight = 0;
		while (!waiting.isEmpty() || !bridge.isEmpty()) {
			answer++;

			// 우선 더 담을 수 있는지 확인
			if (nowWeight <= weight) {
				int test = nowWeight;
				if (test + bridge.peek().truckWeight <= weight) {
					Truck t = waiting.poll();
					bridge.add(t);
				}
			}

			for (Truck t : bridge) {
				t.time++;
			}

			for (Truck t : bridge) {
				if (t.time == bridge_length)
					bridge.poll();
			}
		}

		return answer;
	}

}

class Truck {
	int truckWeight;
	int time;

	public Truck(int truckWeight, int time) {
		this.truckWeight = truckWeight;
		this.time = time;
	}
}
