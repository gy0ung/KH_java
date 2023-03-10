package scanner03;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		// 단어단위로 읽어옴
//		System.out.print("이름을 입력하세요 : ");
//		String str = x.next();
//		System.out.println("당신의 이름은 " + str + "이군요!!!");
		
		// 한줄로 읽어옴
//		System.out.print("주소를 입력하세요 : ");
//		String str2 =x.nextLine();
//		System.out.println("주소 : " + str2);

		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int int1 = x.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int int2 = x.nextInt();
		System.out.println(int1 + "+" + int2 + "=" + (int1 + int2));
		
//		10+20=30
		
	}

}
