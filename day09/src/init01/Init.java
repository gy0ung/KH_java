package init01;

import java.nio.file.spi.FileSystemProvider;

public class Init {
	int num = 10;
	static int sNum = 100; // 클래스변수 : 앞에 'static'이 붙었기때문
	
	// ↓ 인스턴스 초기화 블럭 : 객체가 생성될 때 호출 / 대체적으로 잘 안쓴다.
	{
		System.out.println();
		System.out.println("인스턴스 초기화 블럭");
		System.out.println("인스턴스 변수 num = " + num);
		num = 1;
//		sNum = 800; ← 오류 없이 초기화가능.
		// 인스턴스 초기화 블럭이 호출이 되었다는건 객체가 생성되었다는 것이므로,
		// 클래스가 벌써 올라와서 저장공간이 마련된 상태이다.
	}
	
	// ↓ 클래스 초기화 블럭 : 클래스가 올라올때 호출
	static {
		System.out.println("클래스 초기화 블럭");
		System.out.println("클래스 변수 sNum = " + sNum);
		sNum = 200;
//		num = 100; ← 오류발생 초기화 불가능.
		// 클래스 초기화 블럭은 객체를 생성하지않고 호출하기때문에 
		// num을 호출할수 없다.
	}
	
	// ↓ 생성자 : 객체가 생성될 때 (생성자는 반환형은 없고, 클래스이름과 동일) ★
	Init() {
		System.out.println();
		System.out.println("생성자 호출");
		System.out.println("인스턴스 변수 num = " + num);
		System.out.println("클래스 변수 sNum = " + sNum);
		num = 2;
		sNum = 500;
	}
	
}
