package operator03;

public class Operator02 {

	public static void main(String[] args) {
		// 1. 단항 연산자 // int / int = int → 결과적으로 계산값의 몫만 나온다. (소숫점이하 소실)
		int n1 = -20;
		n1 = +n1; // n1 = +(-20) = -20
		System.out.println(n1);
		
		// 부호를 바꾸고자할때는 앞에 -를 붙여 부호를 바꿀 수 있다.
		n1 = -n1; // n1 = -(-20) = 20
		System.out.println(n1);
		System.out.println("==========");

		int x = 10;
		int y = 7;
		int result = x / y;  // int / int = int기 때문에 뒤에 소숫점이하 전부 짤려서 출력된다.
		System.out.println(result);
		
		double result2 = x / y; // int / int 하여 int로 먼저 출력 된 후 
		                        // double로 형변환되기 때문에 1.0의 값으로 출력된다.
		System.out.println(result2);
		
		// 실수형으로 결과를 출력하고싶으면 적어도 2수중 1개 이상은 실수형이어야 한다.
		double result3 = x / (double)y; // int / double로 계산되어 큰 값인 double로 형변환 되어 출력.
//	 	               = (double)x / y;
//	                   = (double)x / (double)y;	
		System.out.println(result3);
		System.out.println("==========");
		
		// % = 나머지
		int result4 = x % y;
		System.out.println(result4);
		System.out.println("==========");
		
		x = 15; 
		y = 4;
		System.out.println(x + "/" + y + "의 몫은 " + x / y + "이고, 나머지는 " + x % y + "입니다.");
		
		int a = x/y;
		int b = x%y;
		System.out.println(x + "/" + y + "의 몫은 " + a + "이고, 나머지는 " + b + "입니다.");
		
	}

}
