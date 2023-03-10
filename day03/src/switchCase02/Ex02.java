package switchCase02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 5칙연산(+,-,*,/,%)
		// 사용자로부터 3개 (숫자로 2개, 문자 1개)
		// 순서 무관
		Scanner num = new Scanner(System.in);
		System.out.print("1번 숫자를 입력하세요 : ");
		int i1 = num.nextInt();
		System.out.print("2번 숫자를 입력하세요 : ");
		int i2 = num.nextInt();
		System.out.print("5칙연산 중 하나를 입력하세요 : ");
		String s = num.next();
		
		switch(s) {
		case "+" :
			System.out.println(i1 + "+" + i2 + "=" + (i1+i2));
			break;
		case "-" :
			System.out.println(i1 + "-" + i2 + "=" + (i1-i2));
			break;
		case "*" :
			System.out.println(i1 + "*" + i2 + "=" + (i1*i2));
			break;
		case "/" :
			System.out.printf("%d/%d=%.2f",i1,i2,(double)i1/i2); 
			// System.out.printf("%d/%d=%.2f",i1,i2,(double)i1/i2);
			//                         → 붙여쓰기
			// System.out.printf("%d/%d=%.2f\n",i1,i2,(double)i1/i2); 
			//                         → \n을 써줌으로써 println과 같은 역할을 한다.
			break;
		case "%" :
			System.out.println(i1 + "/" + i2 + "의 나머지는 " + (i1%i2));
			break;
		default :
			System.out.println("5칙연산만 입력하세요.");
		}
	}
}