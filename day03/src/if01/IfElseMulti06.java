package if01;

public class IfElseMulti06 {

	public static void main(String[] args) {
		int score = 80;
		
		if(score <= 100) {   // 100 ~ 음수까지 전부 들어옴
			if(score >=90)   // 100 ~ 90 
				System.out.println("A학점");
			else if(score < 90 && score >= 80) // 89 ~ 80
				System.out.println("B학점");
			else if(score < 80 && score >= 70)
				System.out.println("C학점");
			else if(score < 70 && score >= 60)
				System.out.println("D학점");
			else if(score < 60 && score >= 0)
				System.out.println("F학점");
			else
				System.out.println("점수는 0미만이 될 수 없습니다.");
		} else {
			System.out.println("점수는 100이상이 될 수 없습니다.");
		}
		
	}

}
