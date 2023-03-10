package calendar01;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		// indexNumber    0     1    2     3    4    5     6 
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		Calendar data1 = Calendar.getInstance();
		
		// DAY_OF_WEEK은 1부터 나오기때문에 배열로 호출하려면 나온값에 -1을 해주어야한다.
		// DAY_OF_WEEK은 1일 2월 3화 4수 5목 6금 7토 이렇게된다.
		System.out.println(data1.get(Calendar.DAY_OF_WEEK));
		System.out.println(week[6-1]);  // 인덱스넘버는 0부터 시작하기때문
		System.out.println(week[data1.get(Calendar.DAY_OF_WEEK)-1]);
		
		// 데이터를 넣거나 변경할때는 set / 데이터를 가져올때는 get 
		// 년, 월, 일, 시, 분, 초 순으로 넣어짐
		data1.set(2022, 6, 8);
		System.out.println(data1.get(Calendar.YEAR));
		data1.set(2021, 3, 20, 11, 20, 53);
		System.out.println(data1.get(Calendar.YEAR));   // 2021
		System.out.println(data1.get(Calendar.MONTH));  // 3
		System.out.println(data1.get(Calendar.DATE));   // 20
		System.out.println(data1.get(Calendar.HOUR));   // 11
		System.out.println(data1.get(Calendar.MINUTE)); // 20
		System.out.println(data1.get(Calendar.SECOND)); // 53
		
		// 원하는 데이터를 골라 넣고싶을때
		data1.set(Calendar.MONTH,11); // 숫자를 넣어줘도 가능하나 헷갈리기떄문에
		data1.set(Calendar.MONTH, Calendar.DECEMBER); // 월을 넣어준다.
		System.out.println(data1.get(Calendar.MONDAY));
		data1.set(Calendar.HOUR_OF_DAY, 15);
		System.out.println(data1.get(Calendar.HOUR_OF_DAY));
	}

}
