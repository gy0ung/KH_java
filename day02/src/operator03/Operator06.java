package operator03;

import java.util.Scanner;

public class Operator06 {

	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? 식1 : 식2 ; → 조건식이 true면 식1 실행 false면 식2 실행
		
		int i = 10;
		int i2 = 5;
		int result = i > i2 ? i : i2;
		System.out.println(result);
		System.out.println("1.------------------");
		
		// Q1) 사용자로부터 두 수를 입력받아 더 큰 숫자를 출력하시오.
		
		// 사용자로부터 입력받는 수
		Scanner s1 = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오 : ");
		int a = s1.nextInt();
		System.out.print("두번째 숫자를 입력하시오 : ");
		int b = s1.nextInt();
		
		// 입력받은 숫자 중 더 큰 숫자로 출력
		int r = a > b ? a : b;
		System.out.println(a + " 와(과) " + b + " 중 큰 숫자는 : " + r + "입니다.");
		System.out.println(a + " 와(과) " + b + " 중 큰 숫자는 : " + (a>b?a:b) + "입니다.");
		System.out.println("2.------------------");
		// Q2) 사용자로부터 숫자 1개 입력받아 짝수인지 홀수인지 출력하기
		
//		int i3 = 1;
//		int result15 = i3%2;
//		System.out.println(result15);
		
		// 사용자로부터 입력받는 수
		Scanner scan1 = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int i3 = scan1.nextInt();
		System.out.println("입력하신 숫자는 " + (i3%2<1 ?"짝수":"홀수")+ "입니다.");
		System.out.println("입력하신 숫자는 " + (i3%2==0 ?"짝수":"홀수")+ "입니다.");
		String str = i3 % 2 == 0? "짝수" : "홀수";
		System.out.println(str);
		
		
		
		
		
		
	}

}
