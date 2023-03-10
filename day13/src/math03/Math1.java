package math03;


public class Math1 {

	public static void main(String[] args) {
		// 절대값 
		// Math.abs()
		System.out.println("-11의 절대값 : " + Math.abs(-11));
		System.out.println("-11.13의 절대값 : " + Math.abs(-11.13));
		
		// 소수점이하 무조건 올림 
		// Math.ceil()
		System.out.println("24.4의 올림 : " + Math.ceil(24.4));
		System.out.println("13.1의 올림 : " + Math.ceil(-13.1)); 
		
		// 소수점이하 무조건 내림
		// Math.floor()
		System.out.println("13.8의 내림 : " + Math.floor(13.8));
		System.out.println("13.2의 내림 : " + Math.floor(-13.2));
		
		// 소수점이하 반올림
		// Math.round()
		System.out.println("13.6의 반올림 : " + Math.round(13.6));
		System.out.println("13.5의 반올림 : " + Math.round(13.5));
		System.out.println("13.2의 반올림 : " + Math.round(13.2));
		
		// 가장 가까운 정수값을 반환
		// Math.rint()
		System.out.println("13.1의 가까운 정수값 : " + Math.rint(13.1));
		System.out.println("13.9의 가까운 정수값 : " + Math.rint(13.9));
		System.out.println("-13.1의 가까운 정수값 : " + Math.rint(-13.1));
		System.out.println("-13.9의 가까운 정수값 : " + Math.rint(-13.9));
		System.out.println("13.5의 가까운 정수값 : " + Math.rint(13.5));
		System.out.println("-13.5의 가까운 정수값 : " + Math.rint(-13.5));
		
		// 둘중 작은수, 큰수
		// 큰수 Math.max(,) / 작은수 Math.min(,)
		System.out.println("7과 8중 큰숫자 : " + Math.max(7, 8));
		System.out.println("7과 8중 작은숫자 : " + Math.min(7, 8));
		System.out.println("7과 8중 큰숫자 : " + Math.max(7.345, 7.545));
		System.out.println("7과 8중 작은숫자 : " + Math.min(-7.3, -7.5));
		
		// 소수점 2번째짜리까지 얻기
		double value = 12.34567;
		System.out.println(value);
		double value2 = value * 100;
		System.out.println(value2);
		double value3 = Math.round(value2);
		System.out.println(value3);
		System.out.println(value3/100);
		
		System.out.printf("%.2f", 89.456784);
	}

}
