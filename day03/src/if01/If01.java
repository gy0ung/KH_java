package if01;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// if(조건식) {조건이 true일때만 실행할 구문} 
		int score = 95;
		
		if(score>=80) {
			System.out.println("합격입니다.");
		}
		
		System.out.println("1.----------");
		
		// 실행문이 1개인 경우 {}를 생략하여도 출력가능함.
		// 실행문이 1개초과인 경우 1개를 제외한 나머지는 조건과 상관없이 무조건 출력됨(조건문과 별개)
		if(score < 60)
			System.out.println("재평가 대상입니다."); 
		
		System.out.println("2.----------"); // if문과 별개로 출력됨 (if에 미포함)
		
		if(score >= 90) {
			System.out.println("합격입니다.");
			System.out.println("우수한 성적입니다.");
		}
		
		System.out.println("3.----------");
		
		int i1 = 3;
		if(i1 == 0) 
			System.out.println(i1+ "입니다.");
		if(i1 > 0) {
			System.out.println("양수입니다.");
			System.out.println("0보다 큰 수입니다.");
		}
		if(i1 < 0) {
			System.out.println("음수입니다.");
			System.out.println("0보다 작은 수입니다.");
		}
		
		System.out.println("4.----------");
		
		// Q1) 사용자로부터 숫자를 입력받아서 해당 숫자가 홀수인지 짝수인지 출력하시오.
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int x = s1.nextInt();
		
		//조건문으로 짝수 홀수 출력
		if(x%2 >0)
			System.out.println("입력한 숫자는 " + x + "이며 홀수입니다.");
		if(x%2 == 0)
			System.out.println("입력한 숫자는 " + x + "이며 짝수입니다.");
		
	}

}
