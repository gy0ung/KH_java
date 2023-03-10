package polymorphism02;

class A {  }
class B extends A {  }
class C extends A {  }
class D extends B {  }
class E extends C {  }


public class PolymorphismTest01 {
	public static void main(String[] args) {
		B b = new B(); // 객체 생성시 A,B 생성
		C c = new C(); // 객체 생성시 A,C 생성
		D d = new D(); // 객체 생성시 A,B,D 생성
		E e = new E(); // 객체 생성시 A,C,E 생성
		
		// ■ 다형성 : Class 자동 형변환
		A a1 = b; // A타입으로 형변환  / A클래스만 사용가능 
		A a2 = c; // A타입으로 형변환  / A클래스만 사용가능
		A a3 = d; // A타입으로 형변환  / A클래스만 사용가능
		A a4 = e; // A타입으로 형변환  / A클래스만 사용가능
		
		B b1 = d; // B타입으로 형변환 / B,D를 사용하지않는다고 하였던것이 B로 형변환 되면서 
		          //                        A클래스와 B클래스 사용가능 

		C c1 = e; // C타입으로 형변환 / 위와 동일  
	}

}
