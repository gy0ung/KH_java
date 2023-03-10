package for01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int ran = (int)(Math.random()*3)+1;
		Scanner scan = new Scanner(System.in);
		System.out.print("1~3까지 입력하세요 : ");
		int i = scan.nextInt();
		System.out.println("컴퓨터가 입력한 숫자 : " + ran);
		
		if(ran == 1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		} else if (ran == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		} else if (ran == 3) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		switch(i) {
		case 1:
			System.out.println("당신은 가위를 냈습니다.");
			break;
		case 2:
			System.out.println("당신은 바위를 냈습니다.");
			break;
		case 3:
			System.out.println("당신은 보위를 냈습니다.");
			break;
		}
		switch(i-ran) {
		case 0 :
			System.out.println("무승부.");
			break;
		case 1 : case -2 :
			System.out.println("유저승");
			break;
		case -1 : case 2 :
			System.out.println("컴퓨터승");
			break;
			default :
				System.out.println("1~3까지만 입력해주세요");
			break;
		}
		
	/*	int j = i - ran;
		switch (j) {
		case 0 :
			System.out.println("무승부.");
			break;
		case 1 : case -2 :
			System.out.println("유저승");
			break;
		case -1 : case 2 :
			System.out.println("컴퓨터승");
			break;
			default :
				System.out.println("1~3까지만 입력해주세요");
			break;
		} */
	}

}
