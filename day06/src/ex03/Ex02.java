package ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 배열 5개
		// 1번째 주민등록번호 입력 :123456-1234567
		// 형식 유지 (gender 1234 / 14자리입력 / 가운데 -) 외 잘못된형식입니다. 저장x
		// 배열[0] 저장 123456-1******
		
		String jumin[] = new String[5];
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		for(int i=0; i<jumin.length;i++) {
			System.out.print("주민번호를 입력하세요 ex)123456-1234567 : ");
			jumin[i] = scan.next();
			
			if(jumin[i].length() == 14) {
				char dash = jumin[i].charAt(6);
				if(dash == '-') {
				char gender = jumin[i].charAt(7);
				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') {
					jumin[i] = jumin[i].substring(0, 8) + "******";
					continue;
				}else {
					--i;
					System.out.println("잘못된 형식입니다. 다시입력하세요");
				}
				}else {
				--i;
				System.out.println("잘못된 형식입니다. 다시입력하세요");
				}
			}
		}
		System.out.println("5개의 주민번호가 모두 입력되었습니다.");
		break;
		}
		System.out.println(Arrays.toString(jumin));
	}
}
