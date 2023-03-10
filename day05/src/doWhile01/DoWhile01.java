package doWhile01;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// do~while : 1번은 반드시 실행해야되는 반복문일 때 사용
		Scanner scan = new Scanner(System.in);
		int user = 0;

		do {
			System.out.println("----------------");
			System.out.println("  1  |  2  |  3 ");
			System.out.println(" 계속 | 실행 | 중지");
			System.out.println("================");
			System.out.print("선택하세요 : ");
			user = scan.nextInt();
			
		} while(user != 3);
		System.out.println("프로그램이 중지되었습니다.");
		
	}

}
