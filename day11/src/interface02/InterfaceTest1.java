package interface02;

public class InterfaceTest1 {

	public static void main(String[] args) {
		InterClass ic = new InterClass(); // 인터클래스는 클래스이기때문에 객체생성가능
//		Interface if1 = new Interface(); // 인터페이스는 객체생성이안됨
		
		// 인터페이스는 객체를 생성할 수 없지만 자료형변환은 가능하다.
		Interface interf = ic;
		interf.method();
		interf.methodA();
		interf.methodB();
		System.out.println(interf.MAX);
		
		InterfaceA interA = ic;
		interA.methodA();
		System.out.println(interA.MAX);
		InterfaceB interB = ic;
		interB.methodB();
	}

}
