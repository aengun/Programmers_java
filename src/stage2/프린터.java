package stage2;

import java.util.Collections;
import java.util.PriorityQueue;

public class «¡∏∞≈Õ {

	public static void main(String[] args) {
		
		int arr[] = {2,1,3,2};
		
		System.out.println(solution(arr, 2));

	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities) {
        	pq.add(i);
        	System.out.println(pq);
        }
        
        while(!pq.isEmpty()) {
        	for(int i = 0;i<priorities.length;i++) {
        		if(priorities[i] == (int)pq.peek()) {
        			if(i == location) {
        				return answer;
        			}
        			pq.poll();
        			answer++;
        		}
        	}
        }
        
        return answer;
    }

}
