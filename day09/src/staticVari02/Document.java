package staticVari02;

public class Document {
	static int count;
	String name;

/*
	Document() {
		name = "제목없음" + ++count;
		System.out.println("문서 " + name + "이 생성되었습니다.");
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 " + name + "이 생성되었습니다.");
	}
*/
	// 사용자가 입력을 안하면 첫번째 생성자의 "제목없음"이 입력되어 아래의 생성자가 호출
	// 사용자가 입력하면 첫번째 생성자가 아닌 두번째 생성자가 호출
	
	// 생성자는 객체가 생성될때 호출되기때문에 객체만 생성하여도 생성자 안에있는 출력문이 실행됨
	Document() {
		this("제목없음" + ++count); // tist() → 다른생성자 호출	
	}
	Document(String name){
		this.name = name;
		System.out.println("문서 " + name + ".txt이 생성되었습니다.");
	}
}
