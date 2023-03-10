package operator03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 사용자로부터 숫자 2개를 입력받아 사칙연산(+,-,*,/)과 몫, 나머지를 출력하시오.
		// 9 5 → 9+5=14 / 9-5=4 / 9*5=45 / 9/5=1.8 / 몫 1 / 나머지 4
		
		// 사용자로부터 받을 숫자 2개
		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
		System.out.print("연산할 첫번째 숫자를 입력하시오 : ");
		int x = s1.nextInt();
		System.out.print("연산할 두번째 숫자를 입력하시오 : ");
		int y = s1.nextInt();
		
		// 사용자로부터 받은 숫자로 사칙연산식
		int a = x + y;
		System.out.println(x + "+" + y + "=" + a + "입니다.");
		int b = x - y;
		System.out.println(x + "-" + y + "=" + b + "입니다.");
		int c = x * y;
		System.out.println(x + "*" + y + "=" + c + "입니다.");
		double d = (double) x / y;
		System.out.println(x + "/" + y + "=" + d + "입니다.");
		
		// 사용자로부터 받은 숫자의 몫과 나머지 구하는 식
		int e = x / y;
		System.out.println(x + "/" + y + "의 몫은 " + e + "입니다.");
		int f = x % y;
		System.out.println(x + "/" + y + "의 나머지는 " + f + "입니다.");
		
		System.out.println("========");
		
//		하기의 코드처럼 작성 할 수도 있음.
		System.out.println(x + "+" + y + "=" + (x+y) + "입니다.");
		System.out.println(x + "-" + y + "=" + (x-y) + "입니다.");
		System.out.println(x + "*" + y + "=" + x*y + "입니다.");
		System.out.println(x + "/" + y + "=" + (double)x/y + "입니다.");
		System.out.println(x + "/" + y + "의 몫은 " + x/y + "입니다.");
		System.out.println(x + "/" + y + "의 나머지는 " + x%y + "입니다.");
		
		

		
		
		
	}

}
