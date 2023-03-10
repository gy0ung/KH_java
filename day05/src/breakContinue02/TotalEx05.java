package breakContinue02;

import java.util.Scanner;

public class TotalEx05 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 숫자의 약수 구하기
		// ex) 12의 약수 : 1,2,3,4,6,12
		
		Scanner scan = new Scanner(System.in);
		int user = 0;
		int i = 1;
		while(true) {
			System.out.print("약수를 구할 숫자를 입력하세요(0입력시 종료) : ");
			user = scan.nextInt();
			if(user == 0)
				break;
			for(i=1; i <= user; i++) {
				if(user%i ==0)
				System.out.print(i + ",");
			}
			System.out.println("");
		}
	}
}
