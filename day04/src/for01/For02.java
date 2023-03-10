package for01;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
	/*	1. 안녕하세요
		3. 안녕하세요
		5. 안녕하세요 
		... 100개 */
		
		// ctr + shift + o (스캐너 임폴트 자동설정)
		
		int n = 1;
		for (int i = 1; i <= 10; i++) { 
			System.out.println(n + ". 안녕하세요");
			n += 2; // n = n+2
		}
		
		System.out.println("==============");
		
		for(int i=50; i>=1; i--) {
			System.out.println(i + ". 안녕");
		}
		
		System.out.println("==============");
		
		// 1~100까지 합계를 구하시오.
		
		int sum = 0; 
		for(int i1 = 1; i1 <=100; i1++) {
			sum = sum + i1;
			System.out.println(sum);
		}	
		
		System.out.println("==============");
		// 마지막 합계만 출력하고자 하면 {} 밖에다가 출력
			System.out.println(sum);
		// 	System.out.println(i1); 
		// for문 안에 있으면 for문 실행 후 사라지기때문에 i를 사용할수없음
			
		System.out.println("==============");

		// Scanner는 for문 밖에 두고 사용할수있음.
		Scanner scan = new Scanner(System.in);
		
		// j는 지역변수 {}가 끝나면 변수j는 사라지기때문에 {}다음에 사용가능
	/*	for (int j =0; j<=5; j++) {
			System.out.print("이름 입력 : ");
			String name = scan.next();
			System.out.println("당신의 이름은 " + name + "입니다.");
		} */
		
	/*	for(int j=1; j<=3; j++) {
			System.out.print("첫번째 숫자 입력 : ");
			int num = scan.nextInt();
			System.out.print("두번째 숫자 입력 : ");
			int num2 = scan.nextInt();
			
			System.out.println(num + "+" + num2 + "=" + (num+num2)); 
		} */
		
		// 사용자로부터 2숫자와 연산자를 입력받아 연산한 결과 출력(3번 반복)
		
		for(int j = 1; j<=3; j++) {
			System.out.print("연산할 1번째 숫자를 입력하세요 : ");
			int num1 = scan.nextInt();
			System.out.print("연산할 2번째 숫자를 입력하세요 : ");
			int num2 = scan.nextInt();
			System.out.print("연산할 기호를 입력하세요 : ");
			String op = scan.next();
			
			switch (op) {
			case "+" :
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
				break;
			case "-" :
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
				break;
			case "*" :
				System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
				break;
			case "/" :
				System.out.println(num1 + "/" + num2 + "=" + ((double)num1 / num2));
				break;
			case "%" :
				System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
				break;
			default :
				System.out.println("연산기호를 다시 입력하세요.");
				
		/*	if(op.equals("+"))
				System.out.println(num1 + op + num2 + "=" + (num1 + num2));
			char ch = op.charAt(0);
			if(ch == '+')
				System.out.println(num1 + op + num2 + "=" + (num1 + num2));
			else if(ch == '-')
				System.out.println(num1 + op + num2 + "=" + (num1 - num2));
		 */

			}
			 
		}
	}

}
