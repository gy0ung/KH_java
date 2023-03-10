package if01;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class Ex05 {

	public static void main(String[] args) {
		// 사용자로부터 숫자 1개를 입력받아 0, 음수, 양수 출력 (if ~ else문으로)
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int i = s.nextInt();
		
		if(i == 0)
			System.out.println("0입니다.");
		else if(i > 0)
			System.out.println("양수입니다.");
		else
			System.out.println("음수입니다.");
		*/
		
		int score = 49 ;
		if(0 > score || 100 < score)
			System.out.println("점수는 0~100사이 입니다. 다시 입력하세요");
		else if(score <= 100 && score >= 90)
			System.out.println("A학점");
		else if(score < 90 && score >= 80)
			System.out.println("B학점");
		else if(score < 80 && score >= 70)
			System.out.println("C학점");
		else if(score < 70 && score >= 60)
			System.out.println("D학점");
		else 
			System.out.println("F학점");
	}

}
