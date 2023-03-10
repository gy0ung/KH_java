package interface02;

public interface InterfaceA {
	public void methodA();
	public void methodA1();
	
	//구현되어있는 메소드가 있으면 안됨.
/*  public void methodAA() {
		System.out.println("dddd");
	} */
	
	public static final int MAX = 100;
	int MIN = 0; // 알아서 자동으로 상수로 컴파일됨 (public static final)
		
}
