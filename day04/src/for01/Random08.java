package for01;

public class Random08 {

	public static void main(String[] args) {
		// 난수 발생 : random()
		// 0.0 ~ 0.9999999999 (double형)
		double random = Math.random();
		System.out.println(random);
		
		// 0.0 ~ .99999999999999999
		double random1 = Math.random()*10;
		System.out.println(random1); 
		
		// 정수로 : 0 ~ 9 출력
		int random2 = (int)(Math.random()*10);
		System.out.println(random2);
		
		// 1~10까지
		int random3 = (int)(Math.random()*10)+1;
		System.out.println(random3);
		
		// 0~2까지
		int random4 = (int)(Math.random()*3);
		System.out.println(random4);
		
		//1~6까지
		int random5 = (int)(Math.random()*6)+1;
		System.out.println(random5);
		
	}

}
