package operator03;

public class Operator04 {

	public static void main(String[] args) {
		// 논리연산자
		// && : 조건이 모두 다 true 일때만 true
		// || : 조건 중 1개라도 true면 true
		
		int i1 = 10;
		int i2 = 10;
		
		System.out.println(i1>20 && i2>5);
//							 F   &&   T   →  F  // 둘다 true 여야 true  
		System.out.println(i1>20 || i2>5);
//							 F   ||   T   →  T  // 둘 중 하나만 true여도 true
		
		System.out.println("1. ----------------");
		int i3 = 10;
		System.out.println(i1>20 && i2>5 && i3>15);
//		                     F   &&   T  &&   F  →  F 
		System.out.println(i1<20 && i2>5 && i3<15);
//		                     T   &&   T  &&   T  →  T
		System.out.println("2. ----------------");
		
		// ! : not true에 not을 취하면 false가 됨 / false에 not을 취하면 true가 됨.
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(!b1);
		System.out.println(!b2);
		System.out.println("3. ----------------");
		
		char c = 'C';
		System.out.println(c >= 'A' && c <= 'Z');
		
		System.out.println("4. ----------------");
		
		char c1 = '[';
		char c2 = '\\';
		System.out.println(c1);
		System.out.println(c2);
				
		
		
		
		
	}

}
