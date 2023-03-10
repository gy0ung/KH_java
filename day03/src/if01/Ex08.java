package if01;

public class Ex08 {

	public static void main(String[] args) {
		// 달별로 계절 구분
		// 여름과 겨울에는 조건추가 
		// 여름 35도 이상 폭염경보 40도 이상 폭염주의 / 겨울 -10이하 한파경보 -20도 이하 한파주의
		
		
		int month = 12;
		int tem = -17;
		
		if(month>=3 && month <=5)
			System.out.println("봄입니다.");
		else if(month >= 6 && month <= 8) {
			System.out.println("여름입니다.");
			if(tem>=40)
				System.out.println("폭염경보");
			else if(tem>=35)
				System.out.println("폭염주의보");
	      	}
		else if(month >= 9 && month <= 11)
			System.out.println("가을입니다.");
		else if(month == 1 || month == 2 || month ==12 ) {
			System.out.println("겨울입니다.");
			if(tem<=-20)
				System.out.println("한파경보");
			else if(tem<=-10)
				System.out.println("한파주의보");
		 	}
		else
			System.out.println("1~12달만 존재합니다. 다시 넣으세요.");
	}
}

