package for01;

import java.util.Scanner;

public class ForMulti06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 별의 갯수 입력 : ");
		int star = scan.nextInt();
		
		for(int i = 1; i<=star; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(star);
		// System.out.println(i); for문안에 있기때문에 사라져서 출력안됨
		// System.out.println(j);
		
		
	}

}
