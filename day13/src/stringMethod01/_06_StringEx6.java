package stringMethod01;

public class _06_StringEx6 {

	public static void main(String[] args) {            // ↓ 끝index 미포함
		// substring(시작index, 끝index) : 시작index ~ 끝index 직전까지 
		// substring(시작index) : 시작index부터 끝까지
		
		String str = "공공데이터 융합 웹 애플리케이션 개발자 양성과정2";
		
		// 변수에 초기화하여 출력
		String subString = str.substring(6, 8);
		System.out.println(subString);
		
		// 바로출력
		System.out.println(str.substring(6,8));
		System.out.println(str.substring(9));
		
		String sn = "041121-3789760";
		// 올해 몇살인가요? / 생일은 ??월??일인가요? / 여자인가요?남자인가요?
		
		// 풀이
		String birthday = sn.substring(2,6);
		System.out.println("생일은 " + sn.substring(2,4) + "월 " + sn.substring(4,6) + "일 입니다.");
		String gender = sn.substring(7,8);
		switch(gender) {
		case "1" : case "2" : 
			System.out.println("성별은 남자입니다.");
			break;
		case "3" : case "4" :
			System.out.println("성별은 여자입니다.");
			break;
		}
			
		// 강사님 풀이
		String gender3 = sn.substring(7,8);
		if(gender3.equals("1") || gender3.equals("3")) {
			System.out.println("남자입니다.");
		}else if(gender3.equals("2") || gender3.equals("4")) {
			System.out.println("여자입니다.");
		}
			
		int gender2 = Integer.parseInt(sn.substring(7,8));
		if(gender2 == 1 || gender2 == 3) {
			System.out.println("남자입니다.");
		}else if(gender2 == 2 || gender2 == 4) {
			System.out.println("여자입니다.");
		} 
			
		int year = Integer.parseInt(sn.substring(0,2)) + 2000;	
		System.out.println(2023-year + "세");
			
	}

}
