package for01;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// 구구단 출력
		// 2단 출력 
		
		System.out.println("3단");
		for (int i = 1; i<=9; i++) {
			System.out.println("3 * " + i + " = " + (3*i));
		}
		
		// 사용자로부터 구구단 몇단을 출력 할것인지 입력받아 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요 : ");
		int j = scan.nextInt();
		System.out.println(j + "단");
		for(int z = 1; z<=9; z++) {
			System.out.println(j + " * " + z + " = " + (j*z));
		}
		
		
		
	}

}
