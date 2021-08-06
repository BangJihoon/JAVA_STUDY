package MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapExam {
	public static void main(String[] args) {
		// 객체생성
		HashMap<Integer,Integer> map = new HashMap<>();

		// put() 삽입연산으로 초기화
		for (int i = 0; i < 10; i++)
			map.put(i, i*i);
		
		// KeySet()
		HashSet<Integer> set = new HashSet<Integer>(map.keySet());
		System.out.print("keySet() : ");
		for(int i : set)
			System.out.print(i+" ");
		
		// get() 조회
		System.out.println("\n\n4의 value : " + map.get(4)+"\n");
		
		// remove() 삭제
		System.out.println("remove(4) : " + map.remove(4)+"\n");

		// getOrDefault - 가져올때 값이 없으면 Default값을 가져옴
		System.out.println("map.getOrDefault(4, 16) : " + map.getOrDefault(4, 16)+"\n");

		// containsKey
		System.out.println("containsKey(4) : " + map.containsKey(4)+"\n");
		
		// containsValue
		System.out.println("containsValue(16) : "+ map.containsValue(16)+"\n");
		
		// size() 크기
		System.out.println("size : " + map.size()+"\n");
		
		//replace() 변경 , put도 가능
		map.replace(5, 5);
		System.out.println("map.replace 수행후  get(5) : " + map.get(5)+"\n");
		
		// 응용 put은 변경에도 쓰임, getOrDefault는 초기화에 많이쓰임
		map.put(4, map.getOrDefault(4, 16));		// key 5에  4가 가지고 있는값을 얻어와 넣어주려하는데 4가 없으면 16이란 값을 넣어주는경우
		System.out.println("getOrDefault로 4 다시 생성 : " + map.get(4) +"\n");
		
		// Map의 단일객체 Entry 
		System.out.println("Map.Entry<>로 받는  entrySet() 메소드");
		for(Map.Entry<Integer,Integer> m : map.entrySet()) {
			map.put(m.getKey(), m.getKey()*m.getValue()); // 세제곱값으로 초기화		
			System.out.print(map.get(m.getKey())+" ");
		}
		System.out.println("\n");
		
		// clear 모두제거 
		map.clear();
		System.out.println("clear() 수행\n");
		
		// isEmpty() 비었는지 확인
		System.out.println("isEmpty? : " + map.isEmpty()+"\n");		
	}
}
