package calendar01;

import java.time.LocalTime;

public class LocalTime06 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time); // 시:분:초.소숫점 까지 출력됨
		System.out.println(time.getHour() + "시");
		System.out.println(time.getMinute() + "분");
		System.out.println(time.getSecond() + "초");
		
		LocalTime endTime = LocalTime.of(12,20,15);
		System.out.println(endTime);
		
	}

}
