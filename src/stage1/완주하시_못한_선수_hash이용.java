package stage1;

import java.util.HashMap;

public class �����Ͻ�_����_����_hash�̿� {

	public static void main(String[] args) {

		String a[] = { "leo", "kiki", "eden", "kiki"};
		String b[] = { "eden", "kiki","kiki" };
		solution(a, b);

	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

//		HashMap<String, Integer> map = new HashMap<>();
//
//		for (String part : participant) {
//			Integer integer = map.get(part);
//			if (integer == null) {
//				map.put(part, 1);
//				continue;
//			}
//			map.put(part, integer + 1); // �� integer++�ϸ� ������ �ȵɱ�
//		}
//
//		for (String comp : completion) {
//			int i = map.get(comp);
//			map.put(comp, i - 1);
//		}
//
//		for (String key : map.keySet()) {
//			if(map.get(key) != 0) {
//				answer = key;
//			}
//		}
		
		//�ٸ� Ǯ��
		
		HashMap<String, Integer> map2 = new HashMap<>();
		for(String arg : participant) {
			map2.put(arg, map2.getOrDefault(arg, 0)+1);
		}
		for(String key : completion) {
			map2.put(key, map2.get(key)-1);
		}
		for(String s : participant) {
			if(map2.get(s) !=0 ) {
				answer = s;
			}
		}
		return answer;
	}

}
