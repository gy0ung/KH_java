package test0309;

import java.util.Scanner;

public class Test {

// 무한반복하면서 1:약수 / 2:최소공배수 / 3:최대약수 / 0:종료 선택한 번호에 맞는 숫자를 입력받아 출력

	public static void main(String[] args) {
		// 실행 클래스
		Scanner scan = new Scanner(System.in);
		System.out.println("아래의 숫자를 입력하세요");
		System.out.print("1:약수 / 2:최소공배수 / 3:최대공약수 / 0:종료 : ");
		int choice = scan.nextInt();
		
		int num1;
		int num2;

		switch(choice) {
		case 1:
			Divisor d = new Divisor();
			System.out.print("약수를 구할 숫자를 입력하세요 : ");
			num1 = scan.nextInt();
			d.divisor(num1);
			break;
		case 2:
			LCM lcm = new LCM();
			System.out.print("최소공배수를 구할 숫자 2개를 입력하세요 : ");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			lcm.lcm(num1, num2);
			break;
		case 3:
			GCD gcd = new GCD();
			System.out.print("최소공약수를 구할 숫자 2개를 입력하세요 : ");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			gcd.gcd(num1, num2);
			break;
		case 0 :
			System.out.println("종료되었습니다.");
			break;
		}	
	}
}