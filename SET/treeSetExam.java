package SET;

import java.util.Arrays;
import java.util.TreeSet;

public class treeSetExam {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>(Arrays.asList(5,1,6,8,12,86,44));
		for(int i : tset)
			System.out.print(i+" ");
		System.out.println();

		System.out.println(tset.pollFirst()); // 최소값 poll(삭제)
		System.out.println(tset.pollLast());  // 최댓값 poll(삭제)
		System.out.println(tset.first());	//최소값 조회
		System.out.println(tset.last());	//최댓값 조회
		System.out.println(tset.lower(5));	// 5보다 작은값	
		System.out.println(tset.higher(5));	// 5보다 큰값
		System.out.println(tset.ceiling(5));// 5를 포함한 큰값
		System.out.println(tset.floor(5));	// 5를 포함한 작은값
	}

}
