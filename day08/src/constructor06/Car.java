package constructor06;

public class Car {
	String color;
	String model;
	int door;
	
//	Car() {  }  생성자가 없으면 자동생성되어 컴파일됨
	
	Car(String color, String model, int door){
		System.out.println("Car 생성자 호출");
		this.color = color;
		this.model = model;
		this.door = door;
	}
}
