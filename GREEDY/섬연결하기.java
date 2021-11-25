package GREEDY;

import java.util.Arrays;
import java.util.Comparator;

public class 섬연결하기 {
	    static int[] findParent;                                //부모와 자식의 정보가 담긴 배열
	    public static int find(int child) {                    //부모 찾기
	        if(findParent[child] == child) {
	            return child;
	        }else {
	            return findParent[child] = find(findParent[child]);
	        }
	    }
	    public static int solution(int n, int[][] costs) {
	        Arrays.sort(costs, new Comparator<int[]>() {            //가중치 기준으로 오름차순
	            @Override
	            public int compare(int[] o1, int[] o2) {
	                Integer a = o1[2];
	                Integer b = o2[2];
	                return a.compareTo(b);
	            }
	        });
	        
	        findParent = new int[n];                                //초기배열에서 부모는 자기 자신.
	        for(int i = 0; i < n; i++) {
	            findParent[i] = i;
	        }
	        
	        int answer = 0;
	        for(int i = 0; i < costs.length; i++) {
	        	System.out.println("1. "+costs[i][0]+" "+costs[i][1]);
	            int firstIsland = find(costs[i][0]);
	            int SecondIsland = find(costs[i][1]);
	            System.out.println("2. check: "+firstIsland+" " + SecondIsland);
	            if(firstIsland != SecondIsland) {            //부모가 같지 않다면 연결이 안된 최솟값이므로
	                findParent[SecondIsland] = firstIsland;    //연결
		            System.out.println("3. "+firstIsland+", " + SecondIsland+" : connect cost - " + costs[i][2]);
	                answer += costs[i][2];                    
	            }
	            System.out.println("---------------");
	        }
	        return answer;
	    }
	    public static void main(String[] args) {
			int n=5;
			int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
			System.out.println(solution(n, costs));

	    }
}