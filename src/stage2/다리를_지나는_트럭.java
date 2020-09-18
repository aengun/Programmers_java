package stage2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {

	public static void main(String[] args) {

		int a[] = { 7, 4, 5, 6 };
		int b[] = { 10 };
		int c[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println(solution(2, 10, a));
		System.out.println(solution(100, 100, b));
		System.out.println(solution(100, 100, c));

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;

		Queue<Truck> waiting = new LinkedList<>();
		Queue<Truck> bridge = new LinkedList<>();

		for (int i = 0; i < truck_weights.length; i++) {
			waiting.offer(new Truck(truck_weights[i], 0));
		}

		int time = 0;
		int totalWeight = 0;

		while (!waiting.isEmpty() || !bridge.isEmpty()) {
			if(totalWeight<=weight) {
				if(!bridge.isEmpty()) {
					Truck t = bridge.peek();
					if(time-t.entry>=bridge_length) {
						
					}
				}
			}

			
		}
		
		answer = time;

		return answer;
	}

}

class Truck {
	int weight;
	int entry;

	Truck(int weight, int entry) {
		this.weight = weight;
		this.entry = entry;
	}
}
