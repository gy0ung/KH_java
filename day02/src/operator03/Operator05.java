package operator03;

public class Operator05 {

	public static void main(String[] args) {
		// 복합 대입 연산자
		int i1 = 10;
		
		// i1 = i1 + 10; == i1 += 10;
		i1 = i1 + 10;
		System.out.println(i1);
		i1 += 10;
		System.out.println(i1);	
		i1 *= 3;
		System.out.println(i1);
		i1 /= 9;
		System.out.println(i1);
		i1 %= 3;
		System.out.println(i1);
		
	}

}
