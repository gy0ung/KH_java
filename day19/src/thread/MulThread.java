package thread;

import java.util.Scanner;

public class MulThread {

	public static void main(String[] args) {
		MulThread th = new MulThread();
		th.test1();
		System.out.println(Thread.currentThread().getName() + "End");

	}
	
	private void test1() {
		Thread th1 = new Thread(new MultiplyThread(2, 1000),"2배수쓰레드");
		Thread th2 = new Thread(new MultiplyThread(3, 2000),"3배수쓰레드");
		
		th1.start();
		th2.start();
		
		System.out.println("엔터를 치면 종료됩니다.");
		new Scanner(System.in).nextLine();
		
		th1.interrupt();
		th2.interrupt();
		
		// th1.setName("2배수쓰레드"); 쓰레드 이름을 나중에 설정할 경우 이렇게 추가작성
	}
	
	// 2(3), 초
	class MultiplyThread implements Runnable {
		private int num;
		private int millis;
		
		public MultiplyThread(int num, int millis) {
			this.num = num;
			this.millis = millis;
		}
		
		@Override
		public void run() {
			String name = Thread.currentThread().getName();
			int i = 1;
			while(true) {
				try {
					System.out.println("["+ name +"]"+ num*i++);
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					System.out.println("프로그램 종료");
					break;
				}
			}
		}
		
		
	}

}
