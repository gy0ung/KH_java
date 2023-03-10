package calendar01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date04 {

	public static void main(String[] args) {
		// utill로 import
		// Date는 java util에 들어있는 클래스이다.
		Date now = new Date();
		System.out.println(now.toString());
		
		// text로 import
		// SimpleDateFormat는 java text에 들어있는 클래스이다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		System.out.println(sdf.format(now));     // 달은 대문자M / 분은 소문자m
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
		System.out.println(sdf1.format(now));      //hh:12시간표시 a:오전,오후
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		System.out.println(sdf2.format(now));         // HH: 24시간으로 표시
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf3.format(now));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy/M/d");
		System.out.println(sdf4.format(now));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yy년 M월 d일 E요일");
		System.out.println(sdf5.format(now));            // E: 요일
		
		
		
		
	}

}
