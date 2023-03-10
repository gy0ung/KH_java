package scanner03;

import java.util.Scanner;

public class Scanner01_Ex02 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("이름: ");
		String a1 = a.next();
		
		
		Scanner b = new Scanner(System.in);
		System.out.print("나이: ");
		int b1 = b.nextInt();
		
		
		Scanner c = new Scanner(System.in);
		System.out.print("성별: ");
		String c1 = c.next();
		
		System.out.println("===================");
		
		System.out.println("이름은 " + a1 +"이고, " + b1 + "살이며, " + c1 + "입니다.");
	}

}
