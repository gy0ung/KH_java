package ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 주민등록번호 1234561234567 (13자리), 123456-1234567(14자리)
		// 사용자로부터 주민번호를 입력받아서 13자리인지 아닌지 
		// 13자리가 아니면 다시입력하세요 
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("주민등록번호를 입력하세요 ex)123456-1234567 : ");
			String user = scan.next();
			char dash = user.charAt(6);
			if(user.length() == 14) {
				if(dash == '-') {
				char gender = user.charAt(7);
				if(gender == '1' || gender ==  '2' || gender == '3' || gender == '4' ) {
					System.out.println(user.substring(0,8)+"******");
					break;
				}else
				System.out.println("잘못된 형식입니다. 다시입력하세요!");
			}else
				System.out.println("잘못된 형식입니다. 다시입력하세요!");
			}
			
		}
		System.out.println("주민등록번호가 정상 입력되었습니다.");
		
		
	}

}
