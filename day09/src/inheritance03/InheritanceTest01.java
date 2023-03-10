package inheritance03;

// 상속은 클래스명 뒤에 "extends" 을 쓰고 다음 상속받을 부모클래스명을 써준다.

// 아무것도 상속받지않은상태 (기본값인 Object 제외) aa만 사용가능
// 아무것도 상속받지않은 상태처럼 보여도 자바에서는 Object를 컴파일러가 자동상속한다.
// aa만 사용가능
class A {
	int aa = 1;
}

// 클래스 B는  클래스 A를 상속받은 상태.
// 여기서 B클래스는 자식클래스, A클래스는 부모클래스라고 한다. 
// 부모클래스 (A클래스)에 있는 aa도 사용 가능하여 
// aa와 bb 모두 사용가능
class B extends A {
	int bb = 10;
}

//클래스 C는  클래스 B를 상속받은 상태.
//여기서 C클래스는 자식클래스, B클래스는 부모클래스라고 한다. 
// 위와 달리, B는 A클래스를 상속받은 상태로 C클래스에서 A클래스도 사용가능하다. 
// 부모클래스의 부모클래스도 사용가능.
//aa와 bb, cc 사용가능
class C extends B {
	int cc = 30;
}

// 클래스 앞에 public은 한클래스에만 가능
public class InheritanceTest01 {
	public static void main(String[] args) {
		C objC = new C(); 		// C는 B를 B는 A를 상속받았기때문에 C는 A,B,C 사용가능
		System.out.println("aa = " + objC.aa);
		System.out.println("bb = " + objC.bb);
		System.out.println("cc = " + objC.cc);
		
		B objB = new B();
		System.out.println("aa = " + objB.aa);
		System.out.println("bb = " + objB.bb);
//		System.out.println("cc = " + objB.cc);  // 사용불가 
											// B는 A를 상속받았기때문에 A,B만 사용가능 
		
		
		A objA = new A(); 
		System.out.println("aa = " + objA.aa);
//		System.out.println("bb = " + objA.bb); // 사용불가 
//		System.out.println("cc = " + objA.cc); // 사용불가 
											// A는 A만 사용가능 
		
	}

}
