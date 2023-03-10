package for01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 주사위 숫자 맞추기 게임
		// 사용자에게는 2번의 기회가 주어짐
		// random으로 1~6까지의 숫자를 추출하여 사용자가 3회전까지 숫자 맞추기
		
		// 1. 랜덤추출
		// 2. for문
		// 3. 사용자로부터 숫자 몇인지 입력받기
		// 4. 입력받은 숫자가 맞으면 for문 빠져나오기 (break;)
		// 5. 틀리면 계속 for문 돌기
		
		int ran = (int)(Math.random()*6)+1;
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.print("주사위의 숫자를 맞추세요 : ");
			int user = scan.nextInt();
			
			if (ran == user) {
				System.out.println("축하합니다. 정답입니다!");
			break;
			} else {
				if(i==3) {
					System.out.println("3번 모두 틀렸습니다.");
				}else {
				System.out.println("틀렸습니다. 다시 입력하세요!");
				}
			  }
		}

	}
}