package scanner03;

import java.util.Scanner;

public class Scanner01_Ex {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("생년월일을 입력하시오 : ");
		int i = x.nextInt();
		
		System.out.println("당신이 입력한 생년월일은 \"" +  i + "\" 입니다.");
		
		System.out.println("==========================");
		
		Scanner y = new Scanner(System.in);
		System.out.print("영문과 숫자를 조합하여 비밀번호를 입력하시오 : ");
		String i2 = y.next();
		
		System.out.println("당신이 입력한 비밀번호는 \"" + i2 + "\" 입니다.");
		
	
		
	}
	
}
