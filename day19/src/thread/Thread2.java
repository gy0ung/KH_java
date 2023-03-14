package thread;

import java.util.Scanner;

import thread.Thread2.SleepThread;

public class Thread2 {

	public static void main(String[] args) {
		Thread2 thread2 = new Thread2();
		thread2.test1();
		System.out.println(Thread.currentThread().getName() + "End!");
	}

	// 출력은 Thread.currentThread().getName()
	private void test1() { // ↓ 이름을 지정해줄수 있음
		Thread th = new Thread(new SleepThread(), "2의 배수를 출력(1초간격)");
		Thread th2 = new Thread(new SleepThread2(), "3의 배수를 출력(2초간격)");
		th.start();
		th2.start();
		System.out.println("엔터를 치면 인터럽트쓰레드가 멈춥니다.");
		new Scanner(System.in).nextLine();
		th.interrupt();
		th2.interrupt();
	}

	// sleep(밀리초) : 지정한 시간동안 일시정지
	class SleepThread implements Runnable {
		@Override
		public void run() {
			for (int i = 2; i < 30; i++) {
				if(i%2 == 0) {
				try {
					Thread.sleep(1000); // 1초 → sleep(1000)
				} catch (InterruptedException e) {
					System.out.println("쓰레드를 종료합니다.");
					break;
				}
				System.out.println("[" + Thread.currentThread().getName() + "] " + i); // 1초 지연시켰다가 출력
				}
			}
			System.out.println(Thread.currentThread().getName() + "End!");
		}
	}
	class SleepThread2 implements Runnable {
		@Override
		public void run() {
			for (int i = 2; i < 30; i++) {
				if(i%3 == 0) {
					try {
						Thread.sleep(2000); // 1초 → sleep(1000)
					} catch (InterruptedException e) {
						System.out.println("쓰레드를 종료합니다.");
						break;
					}
					System.out.println("[" + Thread.currentThread().getName() + "] " + i); // 1초 지연시켰다가 출력
				}
			}
			System.out.println(Thread.currentThread().getName() + "End!");
		}
	}
	
}
