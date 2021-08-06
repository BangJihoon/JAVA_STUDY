package MAP;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExam {
	public static void main(String[] args) {
		// TreeMap 객체생성
		TreeMap<Integer,Integer> map = new TreeMap<>();

		// 삽입과 동시에 정렬되는 자료구조
		for (int i = 10; i > 0; i--)
			map.put(i, i*i);					//100,91,64,...9,4,1
		// 출력
		System.out.println("삽입과 동시에 정렬됨 : ");
		for(int i : map.keySet())
			System.out.print(map.get(i)+" ");		//1,4,9,...64,91,100
		
		// 역순 출력
		System.out.println("\n\n역순 출력 : ");
		for(int i : map.descendingKeySet())
			System.out.print(map.get(i)+" ");		//100,91,64,...9,4,1
		
		
		System.out.println("\n\n최소값을 받아오는 다양한 메소드의  사용 : ");
		System.out.print(map.pollFirstEntry().getKey()+" ");
		System.out.print(map.firstEntry().getKey()+" ");
		Map.Entry<Integer,Integer> m = map.firstEntry();
		System.out.print(m.getValue()+" ");
		System.out.print(map.firstKey()+" ");
	}
}
