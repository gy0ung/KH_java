package while02;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) { // 무한반복
			System.out.print("계속하려면(c), 정지하려면(q)를 넣으세요 : ");
			String user = scan.next();
			char ch = user.charAt(0);
			
			if(ch == 'c') {
				System.out.println("계속반복합니다.");
			}else if(ch == 'q') {
				System.out.println("정지합니다.");
				break;
			}
		}
			
	/*	if(ch == 'q') {
			System.out.println("정지합니다.");
		}else {
			System.out.println("계속 반복합니다.");
		} */
	}
}
