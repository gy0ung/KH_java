package staticInstVar02;

public class StaticVarTest01 {

	public static void main(String[] args) {
		StaticVar01 s1 = new StaticVar01();
		StaticVar01 s2 = new StaticVar01();
		StaticVar01 s3 = new StaticVar01();
		
		s1.num1 = 10;
		s2.num1 = 20;
		s3.num1 = 30;
		
		System.out.println("s1.num1 = " + s1.num1);
		System.out.println("s2.num1 = " + s2.num1);
		System.out.println("s3.num1 = " + s3.num1);
		System.out.println("==============================");
		
		System.out.println("s1.staNum1 = " + s1.staNum1);
		System.out.println("s2.staNum1 = " + s2.staNum1);
		System.out.println("s3.staNum1 = " + s3.staNum1);
		System.out.println("==============================");

		s1.staNum1 = 500;
		System.out.println("s1.staNum1 = " + s1.staNum1);
		System.out.println("s2.staNum1 = " + s2.staNum1);
		System.out.println("s3.staNum1 = " + s3.staNum1);
		
		System.out.println("StaticVar01.staNum1 = " + StaticVar01.staNum1);
		System.out.println(Math.PI);
	}
}
