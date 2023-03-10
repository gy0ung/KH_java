package varialbe02;

public class Variable04 {

	public static void main(String[] args) {
		System.out.printf("%d\n", 5);
		int num = 10;
		System.out.printf("%d\n",num);
		
		System.out.printf("%f\n", 3.0); // 실무에서 제일 많이 쓰임
		
		System.out.printf("%c\n", 'b');
		System.out.printf("%s\n", "asdqwe");

		System.out.println("=========================");
		
		System.out.format("%d\n", 5);
		num = 10;
		System.out.format("%d\n",num);
		
		System.out.format("%f\n", 3.0); // 실무에서 제일 많이 쓰임
		
		System.out.format("%c\n", 'b');
		System.out.format("%s\n", "asdqwe");
		
		System.out.println("=========================");
		
		// 8진수로 출력
		System.out.printf("%o\n", 9);
		
		// 16진수로 출력
		System.out.printf("%x\n", 15);
		System.out.printf("%X\n", 15);
		
		// 가장 많이 사용하는 문법
		System.out.printf("%6.4f\n", 1.234567);
		System.out.printf("%7.4f\n", 12.34567);
		System.out.printf("%5.4f\n", 12.34567);
		
		// 가장 많이 사용하는 문법 *중요*
		System.out.printf("%.3f\n", 1212.34567);
		System.out.format("%.3f\n", 1212.34567);
		
	}

}
