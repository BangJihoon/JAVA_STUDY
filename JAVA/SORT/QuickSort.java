package JAVA.SORT;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {11,4,8,5,9,21,7,15,1,13};
        
        quickSort(arr, 0, arr.length - 1);
        
        
        for (int i : arr) 
            System.out.print(i+ " ");
        System.out.println(" - 최종 결과");
    }
    
    // 퀵소트는 재귀적으로 호출되며, 두 파티션으로 쪼개가면서 정렬을 하는 분할정복 알고리즘이다.
    public static void quickSort(int[] arr, int start, int end) {
    	// 소팅후 중간지점 신규피봇 반환
    	int part2 = partion(arr,start,end);
    	// 피봇기준으로 왼쪽 파트 소팅
    	if(start < part2-1)
    		quickSort(arr, start, part2-1);
    	// 피봇기준으로 오른쪽 파트 소팅
    	if(part2 < end)
    		quickSort(arr,part2, end);
    }
    
    // 정렬후 나눠지는 두배열중 오른쪽 배열의 시작점을 반환
    public static int partion(int[] arr, int start, int end)  {
    	printProcess(arr);
    	int pivot = arr[(start+end)/2];
    	System.out.println(" -- s,p,e : " +start +" "+(start+end)/2+" "+end + " - pivot="+pivot);
    	while(start<=end) {	// 피봇값을 기준으로 큰값은 왼쪽 작은값은 오른쪽 정렬됨
    		while(arr[start] < pivot) start++;	// 왼쪽 파티션 순회하면서 피봇값과 같거나 큰 경우 swap을 위해 멈춤
    		while(arr[end] > pivot) end--;	// 오른쪽 파티션 순회하면서 피봇값과 같거나 작은 경우 swap을 위해 멈춤
    		if(start<=end) {		// 서로가 교차되지 않은 경우만 swap
    			swap(arr,start,end);
    			start++;
    			end--;
    		}// 서로가 교차된 경우 swap하지 않고 정렬이 다 된 상태일것
    	}
    	return start;
	}
    public static void printProcess(int[] arr) {
    	for(int i : arr)
    		System.out.print(i+" ");
    }
    public static void swap(int[] arr, int a, int b){
    	int tmp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = tmp;
    }    
}
