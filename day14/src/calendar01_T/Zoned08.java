package calendar01_T;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class Zoned08 {

	public static void main(String[] args) {
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
		
		ZonedDateTime londonDT = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonDT);
		
		ZonedDateTime berlinDT = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(berlinDT);
		
		ZonedDateTime NewYorkDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(NewYorkDT);
		
		// 기준시간
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		
		ZoneOffset seoulOffset = ZoneOffset.of("+09:00");
		System.out.println(ZonedDateTime.now(seoulOffset));
		
		// 이전버전 Calendar사용
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timezone);
		System.out.println(now.get(Calendar.HOUR));
	}
	

}
