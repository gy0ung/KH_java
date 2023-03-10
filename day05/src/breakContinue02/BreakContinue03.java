package breakContinue02;

import java.util.Scanner;

public class BreakContinue03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int user = 0;

		while(true) {
			System.out.println("----------------");
			System.out.println("  1  |  2  |  3 ");
			System.out.println(" 계속 | 실행 | 중지");
			System.out.println("================");
			System.out.print("선택하세요 : ");
			user = scan.nextInt();
			if(user == 3) {
				System.out.println("프로그램이 중지되었습니다.");
				break;
			} else if(!(user == 1 || user == 2)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
			switch(user) {
			case 1 :
				System.out.println("계속을 선택했습니다.");
				break;
			case 2 :
				System.out.println("게임을 시작합니다.");
				break;
			}
			System.out.println("---"); // continue 를 해주지않으면 해당코드는 출력됨
		}

		
		
		
		
		
	}

}
