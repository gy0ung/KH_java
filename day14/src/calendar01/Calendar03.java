package calendar01;

import java.time.Month;
import java.util.Calendar;

public class Calendar03 {

	public static void main(String[] args) {
		Calendar data1 = Calendar.getInstance();
		data1.set(2022, 3, 10);
		System.out.println(data1.get(Calendar.YEAR)+"년 "+data1.get(Calendar.MONTH) + "월 " + data1.get(Calendar.DATE)+"일");
		
		// 100일후  /  add로 100일 추가
		data1.add(Calendar.DATE, 100); 
		System.out.println(data1.get(Calendar.YEAR)+"년 "+data1.get(Calendar.MONTH) + "월 " + data1.get(Calendar.DATE)+"일");
		// 100일전
		data1.add(Calendar.DATE, -100); 
		System.out.println(data1.get(Calendar.YEAR)+"년 "+data1.get(Calendar.MONTH) + "월 " + data1.get(Calendar.DATE)+"일");
		// 2달후
		data1.add(Calendar.MONTH, 2); 
		System.out.println(data1.get(Calendar.YEAR)+"년 "+data1.get(Calendar.MONTH) + "월 " + data1.get(Calendar.DATE)+"일");
		// 3달전
		data1.add(Calendar.MONTH, -3); 
		System.out.println(data1.get(Calendar.YEAR)+"년 "+data1.get(Calendar.MONTH) + "월 " + data1.get(Calendar.DATE)+"일");
		// 1년후
		data1.add(Calendar.YEAR, 1); 
		System.out.println(data1.get(Calendar.YEAR)+"년 "+data1.get(Calendar.MONTH) + "월 " + data1.get(Calendar.DATE)+"일");
		// 10년전
		data1.add(Calendar.YEAR, -10); 
		System.out.println(data1.get(Calendar.YEAR)+"년 "+data1.get(Calendar.MONTH) + "월 " + data1.get(Calendar.DATE)+"일");
	
	
	
	}

}
