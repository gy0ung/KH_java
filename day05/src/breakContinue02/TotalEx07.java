package breakContinue02;

import java.util.Scanner;

public class TotalEx07 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 숫자의 약수 구하기
		// ex) 12의 약수 : 1,2,3,4,6,12
		
		Scanner scan = new Scanner(System.in);
		int user = 0;
		int i = 1;
		System.out.print("숫자를 입력하세요 : ");
		user = scan.nextInt();
			System.out.print(user+"의 약수 : ");
			
			for(i=1; i <= user; i++) {
				if(user%i ==0)
					System.out.print(i + ",");
			}
	}
}
