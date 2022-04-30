package JAVA.LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ArrayListExam {
	public static void main(String[] args) {
		// List의 Class 중 ArrayList, Stack을 사용하여 코드작성
		ArrayList<Integer> list = new ArrayList<>();
		Stack<Integer> s = new Stack<>();
		//초기화
		for (int i = 0; i < 10; i++)
			list.add(i);
		for (int i = 0; i < 10; i++)
			s.push(i);
		
		// max() , min() 최대 최소 찾기
		System.out.println("s max() : " + Collections.max(s));
		System.out.println("list min() : " + Collections.min(list));
		
		//sort()
		Collections.sort(s); //오름차순
		Collections.reverse(s); //내림차순
		Collections.sort(s, Collections.reverseOrder()); // 내림차순 
		System.out.print("\n역순 출력 : ");
		for(int i : s)
			System.out.print(i+" ");
		System.out.println("\n");
		
		
		// 섞기(Shuffling) 랜덤하게 섞는다
		Collections.shuffle(s);
		System.out.print("랜덤 출력 : ");
		for(int i : s)
			System.out.print(i+" ");
		System.out.println("\n");

		// binarySearch() -> 해당값의 index를 반환 (실패시 -1 반환)
		// 오름차순 정렬이 되어있어야 사용가능하다.
		Collections.sort(s); //오름차순
		System.out.print("정방향 정렬 : ");
		for(int i : s)
			System.out.print(i+" ");
		System.out.println("\n\n이진탐색 5값의 위치: "+Collections.binarySearch(s, 5));
		
		// 두 리스트가 다른지 확인 disjoint
		// 두 리스트중 공통값이 있으면 False
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(99,88));
		System.out.println("\ndisjoint (완전히 다른가?) : "+ Collections.disjoint(list, list2));
		
		
	}
}
