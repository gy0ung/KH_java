package operator03;

public class Operator03 {

	public static void main(String[] args) {
		// 비교연산자 : > , < , >= , <= , ==(같다) , !=(같지않다) 
		int i1 = 10;
		int i2 = 20;
		
		System.out.println(i1 > i2);
		System.out.println(i1 < i2);
		System.out.println(i1 == i2);
		System.out.println(i1 != i2);
		System.out.println("---------");
		
		// 변수값에 넣어주려면 boolean을 이용
		boolean b1 = i1 > i2;
		boolean b2 = i1 < i2;
		boolean b3 = i1 == i2;
		boolean b4 = i1 != i2;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("i1과 i2가 같은가? " +b3);
		System.out.println("i1과 i2가 같지않은가? " + b4);
		
	}

}
