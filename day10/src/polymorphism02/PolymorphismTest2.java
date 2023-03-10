package polymorphism02;

class Car {
	private String model;
	private int door;
	// 부모에게 매개변수를 넣어주는 생성자가 있으면 
	// 반드시!!!!  자식에게 해당 매개변수를 넣어주는 생성자가 있어야한다.
	Car(String model, int door) {
		this.model = model;
		this.door = door;
	}
	void drive() {
		System.out.println("운전중");
	}
	void stop() {
		System.out.println("stop!!");
	}
	void call() {
		System.out.println("차를 호출한 곳으로 갑니다");
	}
}

class Ambulance extends Car {
	Ambulance(String model, int door) { // ← 부모에게 매개변수를 넣어주는 생성자가 있기때문
		super(model, door); // super 필수!
	}
	@Override   // 오버라이딩을 할때는 왠만하면 붙여주는것이 좋다! 오류를 줄일수있음
	void call() {
		System.out.println("삐뽀 삐뽀~~~, 환자 이송 중");
	}
	void ride() {
		System.out.println("환자만 탈수 있습니다.");
	}
}

class FireEngine extends Car {
	FireEngine(String model, int door) { // ← 생성자기때문에 클래스이름과 동일해야한다.
		super(model, door); // super 필수!
	}
	@Override   // 오버라이딩을 할때는 왠만하면 붙여주는것이 좋다! 오류를 줄일수있음
	void call() {
		System.out.println("애앵~~~, 화재가 난곳으로 갑니다");
	}
}

public class PolymorphismTest2 {
//	Car car; // 클래스바로 아래쓰는것은 인스턴스변수로 기본값으로 초기화된다. (null)
	public static void main(String[] args) {
		Car car = null; // 지역변수는 쓸때 초기화를 해주어야한다.
		FireEngine fe1 = new FireEngine("소방차", 2);
		Ambulance ab1 = new Ambulance("구급차", 3);
		
		car = fe1; 
		car.call(); // 오버라이딩을 했기때문에 자식것으로 호출됨
		car.stop();
		car.drive();

		System.out.println();
		car = ab1; 
		car.call(); // 오버라이딩을 했기때문에 자식것으로 호출됨
//		car.ride(); // Car로 형변환되어 자식타입인 ride는 호출이 안됨.
		
		System.out.println();
		// Car로 형변환되어 자식것은 호출안되었으나, 하기와 같이해주면 부모자식 모두 사용가능
		// 오버라이딩부분은 자식것으로 출력됨
		ab1 = (Ambulance)car; 
		ab1.call(); // 부모자식 모두에게 있지만 오버라이딩된 메서드로 자식메서드가 출력됨
		ab1.ride(); // 자식에게만 있는 메서드
		ab1.stop(); // 부모에게만 있는 메서드
	}
}
