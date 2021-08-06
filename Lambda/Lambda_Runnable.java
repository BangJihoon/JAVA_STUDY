package Lambda;

import java.util.function.Consumer;

public class Lambda_Runnable {
	public static void main(String[] args) {
		
		//Runnable 을 미리 정의후 사용
		Runnable runnable = () -> System.out.println("1. Runnable run lambda 람다식 정의");
		runnable.run();
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		// 객체 생성시 정의
		Thread t2 = new Thread(() -> System.out.println("2. Runnable run lambda 람다식 정의"));
		t2.start();
	}	
}
