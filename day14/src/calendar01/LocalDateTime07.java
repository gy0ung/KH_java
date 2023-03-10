package calendar01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTime07 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today); // 년-월-일T시:분:초.소숫점 으로 출력

		LocalDateTime today2 = LocalDateTime.of(2023, 07, 20, 18, 20, 30);
		System.out.println(today2);

		LocalDateTime today3 = LocalDateTime.now();
		System.out.println(today3); // 년-월-일T시:분:초.소숫점 으로 출력

		LocalDateTime startDT = LocalDateTime.of(2023, 02, 8, 9, 30, 0);
		LocalDateTime endDT = LocalDateTime.of(2023, 07, 20, 18, 20, 30);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM-dd a hh:mm:ss");

		System.out.println("시작일 : " + startDT.format(dtf));
		System.out.println("종료일 : " + endDT.format(dtf));
		
		// today의 날짜가 종료일 이전일지
		if(today.isBefore(endDT)) {
			System.out.println("진행 중 입니다.");
			// today의 날짜가 종료일인지
		} else if(today.isEqual(endDT)) { // isEqual 대신 equals 사용해도됨
			System.out.println("종료합니다.");
			// today의 날짜가 마지막날짜를 이미 지났는지
		} else if(today.isAfter(endDT)) {
			System.out.println("종료했습니다.");
		}

		
		// 날짜만 가능
		LocalDate nowToday = LocalDate.now();
		LocalDate endToday = LocalDate.of(2023,07,20);
		Period period = nowToday.until(endToday);
		System.out.println(period.getMonths()+"개월 "+ period.getDays()+ "일 남음");
		
		// 시간만 가능
		LocalTime endTime = LocalTime.of(18,20,30);
		LocalTime nowTime = LocalTime.now();
		Duration duration = Duration.between(nowTime,endTime);
		System.out.println(duration.getSeconds());
		
		// 날짜시간 모두 가능
		System.out.println("오늘 수업 종료시간까지 " + nowTime.until(endTime, ChronoUnit.HOURS)+"시간 남음");
		System.out.println("종료일까지 " + today.until(endDT, ChronoUnit.HOURS)+"시간 남음");
		System.out.println("종료일까지 " + today.until(endDT, ChronoUnit.MONTHS)+"개월 남음");
		System.out.println("종료일까지 " + today.until(endDT, ChronoUnit.DAYS)+"일 남음");
		
		// 날짜시간 모두 가능
		System.out.println(today.plusYears(1).format(dtf));
		System.out.println(today.plusMonths(3).format(dtf));
		System.out.println(today.plusDays(15).format(dtf));
		System.out.println("-----------------------");
		
		System.out.println(today.minusYears(1).format(dtf));
		System.out.println(today.minusMonths(3).format(dtf));
		System.out.println(today.minusDays(15).format(dtf));
		System.out.println(today.minusSeconds(30).format(dtf));
		
	}

}
