package stage2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {

	public static void main(String[] args) {

		int a[] = { 7, 4, 5, 6 };
		int b[] = { 10 };
		int c[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println(solution(2, 10, a));
		System.out.println();
		System.out.println(solution(100, 100, b));
		System.out.println();
		System.out.println(solution(100, 100, c));

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

		while (!bridge.isEmpty() || !waiting.isEmpty()) {

			answer++;

			if (nowWeight <= weight && !waiting.isEmpty()) {
				int testWeight = waiting.peek().truckWeight;
				if (nowWeight + testWeight <= weight) {
					Truck t = waiting.poll();
					bridge.add(t);
					nowWeight += testWeight;
				}
			}

			for (Truck t : bridge) {
				t.time++;
			}

//			for (Truck t : bridge) {
//				if (t.time >= bridge_length) {
//					nowWeight -= bridge.peek().truckWeight;
//					bridge.poll();
//				}
//			}

			Iterator<Truck> iter = bridge.iterator();
			while (iter.hasNext()) {
				Truck t = iter.next();
				if (t.time >= bridge_length) {
					nowWeight -= bridge.peek().truckWeight;
					iter.remove();
				}
			}

		}

		return answer + 1;
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
