package calendar01;

import java.nio.file.spi.FileSystemProvider;
import java.util.Calendar;

public class Calendar01 {
	public static void main(String[] args) {
		// 객체생성
		Calendar today = Calendar.getInstance();
		
		// 현재년도 : 객체이름.get(Calendar.YEAR)
		System.out.println("현재년도 : " + today.get(Calendar.YEAR));
		
		// 현재월 : (객체이름.get(Calendar.MONTH)+1)
		// MONTH의 경우 0부터시작하기때문에 현재 월을 알고싶으면 +1 해주어야한다.
		// (today.get(Calendar.MONTH)+1)
		System.out.println("현재월 : " + (today.get(Calendar.MONTH)+1));
		
		// 올해의 몇째 주 : 객체이름.get(Calendar.WEEK_OF_YEAR)
		System.out.println("올 해의 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		// 이번달의 몇째 주 : 객체이름.get(Calendar.WEEK_OF_MONTH)
		System.out.println("이 달의 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
	
		// 몇일 : 객체이름.get(Calendar.DATE)
		System.out.println("몇일 : " + today.get(Calendar.DATE));
		// 몇일(이번달의) : 객체이름.get(Calendar.DAY_OF_MONTH)
		System.out.println("몇일(이번달의) : " + today.get(Calendar.DAY_OF_MONTH));
		// 365일중 몇일 : 객체이름.get(Calendar.DAY_OF_YEAR)
		System.out.println("365일중 몇일 : " + today.get(Calendar.DAY_OF_YEAR));
	
		// 요일(숫자로) 1~7 (1:일요일) : 객체이름.get(Calendar.DAY_OF_MONTH)
		System.out.println("요일(숫자로) 1~7 (1:일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		int week = today.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1 :
			System.out.println("일요일");
			break;
		case 2 :
			System.out.println("월요일");
			break;
		case 3 :
			System.out.println("화요일");
			break;
		case 4 :
			System.out.println("수요일");
			break;
		case 5 :
			System.out.println("목요일");
			break;
		case 6 :
			System.out.println("금요일");
			break;
		case 7 :
			System.out.println("토요일");
			break;
		}
		
		// 오전_오후(0:오전, 1:오후) :
		System.out.println("오전_오후(0:오전, 1:오후) : " + today.get(Calendar.AM_PM));
		
		// 시간(0~11) :
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		// 시간(0~23) :
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		// 분 :
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		// 초 :
		System.out.println("초 : " + today.get(Calendar.SECOND));
		// 초(1/1000초) :
		System.out.println("초(1/1000초) : " + today.get(Calendar.MILLISECOND));
		
		int month = (today.get(Calendar.MONTH)+1); 
		int day = today.get(Calendar.DATE); 
		int ap = today.get(Calendar.AM_PM); 
		int time = today.get(Calendar.HOUR); 
		int minute = today.get(Calendar.MINUTE); 
		int week1 = today.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("==============================");
		System.out.println(month + "월 " + day + "일");
		if(ap == 0) {
			System.out.print("오전");
		}else {
			System.out.print("오후");
		}
		System.out.println(" " + time + "시 " + minute + "분");
		switch(week1) {
		case 1 :
			System.out.println("일요일");
			break;
		case 2 :
			System.out.println("월요일");
			break;
		case 3 :
			System.out.println("화요일");
			break;
		case 4 :
			System.out.println("수요일");
			break;
		case 5 :
			System.out.println("목요일");
			break;
		case 6 :
			System.out.println("금요일");
			break;
		case 7 :
			System.out.println("토요일");
			break;
		}
	}	
	

}
