package switchCase02;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		int i = 8;
		switch(i) {
		case 1:
		case 6:	
			System.out.println("A반");
			break;
		case 2: case 7: case 8:
			System.out.println("B반");
			break;
		case 3:
			System.out.println("C반");
			break;
		case 4:
			System.out.println("D반");
			break;
		default :
			System.out.println("F반");
		}
		
		// Q1) 사용자로부터 달을 입력받아
		// switch문으로 봄,여름,가을,겨울을 출력하기
		
		Scanner s = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int o = s.nextInt();
		switch(o) {
		case 12 : case 1 : case 2 :
			System.out.println("겨울입니다.");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("봄입니다.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름입니다.");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("가을입니다.");
			break;
		default :
		System.out.println("1~12까지만 입력해주세요.");
		}
		
		// Q2) 사용자로부터 점수를 입력받아 a,b,c,d 학점 출력하기
		
		Scanner s2 = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int sco = s2.nextInt();
		switch(sco/10) {
		case 10 : case 9 :
			System.out.println("A학점");
			break;
		case 8 :
			System.out.println("B학점");
			break;
		case 7 :
			System.out.println("C학점");
			break;
		case 6 :
			System.out.println("D학점");
			break;
		case 5 : case 4 : case 3 : case 2 : case 1 : case 0 :
			System.out.println("F학점");
			break;
		default :
			System.out.println("점수는 0~100점이므로 점수를 재입력하세요.");
		}
				
	}
}
