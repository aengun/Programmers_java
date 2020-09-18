package stage2;

import java.util.HashMap;

public class ¿ß¿Â {

	public static void main(String[] args) {
		
		String[][] arr = {
				{"yello", "head"},
				{"blue", "eye"},
				{"green", "head"}
		};
 		
		solution(arr);
 		
	}

	public static int solution(String[][] clothes) {
		int answer = 0;

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
		}
		
		answer = 1;
		
		for(String key : map.keySet()) {
			answer *= map.get(key)+1;
		}
		return answer-1;
	}

}
