package while02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 사용자로부터 점수를 입력받아 A~F학점 출력
		// 사용자가 점수에 -1를 넣으면 정지
		// -1이 아닌 0~100까지 넣으면 계속점수를 물어보고 학점 출력

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("점수를 입력하세요 : ");
			int user = scan.nextInt();
			if (user <= 100) {
				if (user >= 90) {
					System.out.println("A학점");
				} else if (user >= 80) {
					System.out.println("B학점");
				} else if (user >= 70) {
					System.out.println("C학점");
				} else if (user >= 60) {
					System.out.println("D학점");
				} else if (user >= 0) {
					System.out.println("F학점");
				} else if (user == -1) {
					System.out.println("정지");
					break;
				} else if (user <= -2) {
					System.out.println("0~100 혹은 -1 중에 입력하세요!");
				}
			} else {
				System.out.println("0~100 혹은 -1 중에 입력하세요!");
			}
		}
	}
}
