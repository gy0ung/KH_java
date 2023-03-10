package interface02;

public class InterClass implements Interface {

	@Override
	public void methodA() {
		System.out.println("InterfaceA-methodA() 실행");
	}

	@Override
	public void methodA1() {
		System.out.println("InterfaceA-methodA1() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceB-methodB() 실행");
	}

	@Override
	public void methodB1() {
		System.out.println("InterfaceB-methodB1() 실행");
	}

	@Override
	public void method() {
		System.out.println("Interface-method() 실행");
	}

}
