package staticVari02;

public class DocumentTest {

	public static void main(String[] args) {
		// 생성자는 객체가 생성될때 호출되기때문에 객체만 생성하여도 생성자 안에있는 출력문이 실행됨
		Document d1 = new Document();
		Document d2 = new Document("java");
		Document d3 = new Document();
		Document d4 = new Document();
		
	}

}


// 무조건 사용하면 상속
// 사용을 할때있고 안할수도있으면 객체를 생성하여 사용

// 자바는 단일 상속만 허용 (C++은 다중상속 가능)