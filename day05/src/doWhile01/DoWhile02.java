package doWhile01;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// 1. 랜덤으로 1~100사이의 숫자를 추출
		//     ▶ doWhile문으로 
		// 사용자가 랜덤숫자 맞추기
		//     ▶ Scanner추출
		// 정답 30, 사용자 67 → "보다 작은 숫자로 다시 도전하세요!"
		//       ,       25 → "보다 큰 숫자로 다시 도전하세요!"
		// "축하합니다. 정답입니다!!"
		// " ?회만에 정답을 맞췄습니다."
		
		Scanner scan = new Scanner(System.in);
		int user = 0;
		int i = 0;
		int ran = (int)(Math.random()*100)+1;
	//	System.out.println(ran);
		do {
			System.out.print("1~100사이의 숫자를 입력하세요 : ");
			user = scan.nextInt();
			i++;
			if(user < ran) {
				System.out.println("보다 큰 숫자로 다시 도전하세요!");
			}else if(user >ran) {
				System.out.println("보다 작은 숫자로 다시 도전하세요!");
			}
		} while(user != ran); {
			System.out.println("축하합니다. 정답입니다!!");
			System.out.println(i + "회만에 정답을 맞췄습니다.");
			}
	} 

}
