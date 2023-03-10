package varialbe02;

public class Variable03 {

	public static void main(String[] args) {
		// byte = 1byte / 127까지 들어감
		byte by1 = 10;
		System.out.println(by1);
		
		// short = 2byte / 30000까지 들어감
		short sh = 30000;
		System.out.println(sh);
		
		char ch1 = '가';
		int chInt = ch1;
		System.out.println("'가'의 유니코드 : " + chInt);
		System.out.println("===============");
		
		char ch2 = '김';
		int chInt2 = ch2;
		System.out.println("'김'의 유니코드 : " + chInt2);
		
		char ch3 = '민';
		int chInt3 = ch3;
		System.out.println("'민'의 유니코드 : " + chInt3);
		
		char ch4 = '경';
		int chInt4 = ch4;
		System.out.println("'경'의 유니코드 : " + chInt4);
		System.out.println("===============");
		
		double dou1 = 5/3.0;
		System.out.print(dou1);
		
		
	}

}
