package exception01;

public class _09_Throws {

	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스 있음");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + " 클래스 없음");
		}
		
	}
	
						   // ↓ throws를 쓰려면 꼭 try,catch를 써야함
	static void findClass() throws ClassNotFoundException {
		Class class2 = Class.forName("java.lang.Strig2");
	}
}
