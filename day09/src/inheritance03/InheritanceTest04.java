package inheritance03;

class A1 {
	int i;
}

class B1 extends A1 {
	String i;
}


// 클래스 앞에 public은 한클래스에만 가능
public class InheritanceTest04 {
	public static void main(String[] args) {
		B1 b1 = new B1(); 
		b1.i = "KH정보교육원";
		System.out.println(b1.i);
        // 우선순위는 자손의 변수가 있으면 먼저 실행됨.
		// b1.i = 100; / B1클래스의 i변수 먼저 수행하므로 자료형이 맞지않아 오류발생.
						// B1의 변수를 먼저 보고 없으면 상속받은 부모 A1의 변수로 올라간다.
		        		// 우선순위는 본인이 가진 변수부터★
		
		A1 a1 = new A1();
		a1.i = 100;
		System.out.println(a1.i);

	}

}
