package calendar01;

import java.time.LocalDate;

public class LocalDate05 {

	public static void main(String[] args) {
		
		// LocalDate.now()를 통해 오늘에 대한 정보출력
		LocalDate today = LocalDate.now();
		// 변수이름만 호출해도 출력되는것은 toSting이 오버라이딩된 상태라는것 
		// LocalDate는 toSting이 오버라이딩된 상태다
		System.out.println(today);
		System.out.println(today.getYear() + "년");
		System.out.println(today.getMonth()); // 영문으로 출력
		System.out.println(today.getMonthValue() + "월"); // 숫자로 출력
		System.out.println(today.getDayOfMonth() + "일");
		System.out.println("365일 중 " + today.getDayOfYear()+ "일");
		System.out.println(today.getDayOfWeek());
		                                // .getValue() 를 붙이면 숫자로 출력됨 
		System.out.println(today.getDayOfWeek().getValue());
		System.out.println("이달은 총 "+today.lengthOfMonth()+"일 까지 있다.");
		                          // ↓ 윤년인지 아닌지 파악가능 일자 수로 파악가능
		System.out.println("올해는 총 "+today.lengthOfYear()+"일 까지 있다.");
		                          // ↓ 윤년인지 아닌지 true, false로 파악가능
		System.out.println("올해 윤년 : " + today.isLeapYear());
		
		// .of(변경하고싶은 날짜)를 이용하여 다른날짜로 변경가능
		LocalDate endDay = LocalDate.of(2023, 7, 20);
		System.out.println(endDay);
		
		
		
		
		
		
		
		
	}

}
