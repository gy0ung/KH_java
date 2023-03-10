package if01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 점수를 입력받아서 
		// 70점이상이면 합격, 90점이상이면 장학생 그외 축하합니다.
		// 70점미만이면 불합격 
		// 모든사람들에게 고생하셨습니다.
		// 중첩 if사용할것
		
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = s.nextInt();

		if(score >= 70) {
				System.out.println("합격입니다.");
			if(score >= 90)
				System.out.println("장학생입니다.");
		    else
				System.out.println("축하합니다.");
		    }
	    else
				System.out.println("불합격하셨습니다.");
	    
			System.out.println("고생하셨습니다.");

			System.out.println("================================");
			
		if(score <= 100 && score >= 0) {
			System.out.println("고생하셨습니다.");
			if(score >= 70) {
				System.out.println("합격입니다.");
				if(score >= 90)
					System.out.println("장학생입니다.");
				else
					System.out.println("축하합니다.");
			} else
				System.out.println("불합격입니다.");
		} else
			System.out.println("점수는 0~100이므로, 다시입력바랍니다.");
		
		
		
	}

}
