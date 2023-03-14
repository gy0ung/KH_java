package thread;

import java.util.Scanner;

import thread.Thread3.SleepThread;

public class Thread3 {

	public static void main(String[] args) {
		Thread3 thread2 = new Thread3();
//		thread2.test1();
//		thread2.test2();
		thread2.test3();
		System.out.println(Thread.currentThread().getName() + "End!");
	}

	// 출력은 Thread.currentThread().getName()
	private void test1() { // ↓ 이름을 지정해줄수 있음
		new Thread(new SleepThread(), "밀리초쓰레드").start();
	}

	// sleep(밀리초) : 지정한 시간동안 일시정지
	class SleepThread implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i < 10; i++) {
				try {
					Thread.sleep(1000); // 1초 → sleep(1000)
				} catch (InterruptedException e) {
					System.out.println("쓰레드를 종료합니다.");
					break;
				}
				System.out.println("[" + Thread.currentThread().getName() + "] " + i); // 1초 지연시켰다가 출력
			}
			System.out.println(Thread.currentThread().getName() + "End!");
		}
	}

	// 데몬쓰레드(Daemon)
	// 	- 백그라운드로 작동하는 쓰레드
	//	- 일반쓰레드가 종료되면 데몬쓰레드는 자동종료
	
	private void test2() {
		Thread th = new Thread(new SleepThread(), "초시계쓰레드");
		th.setDaemon(true); // 쓰레드가 호출되기전에 실행되어야함 (오류발생)
		th.start();
		
		System.out.println("아무글자나 입력하세요....");
		
		String str = new Scanner(System.in).nextLine();
	}
	
	// interrupt
	//  - 다른 쓰레드에 InterruptException을 유발하여 종료/분기처리가 가능하도록 할 수 있다.
	
	private void test3() {
		Thread th = new Thread(new SleepThread(),"인터럽트쓰레드");
		th.start();
		
		System.out.println("엔터를 치면 인터럽트쓰레드가 멈춥니다.");
		new Scanner(System.in).nextLine();
		th.interrupt();
	}
	
	
	
	
	
	
}
