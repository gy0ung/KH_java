package student07;

public class Car {
	String color = "black";
	String model = "SM7";
	int door = 5;
	
//	Car(){  } // 아무내용 넣지않아도 입력해주어야 아무것도 안넣었을때 오류발생하지않음
	
	Car(){
		this("black","SM7",5);
		System.out.println("매개변수가 없는 생성자");
	}
	
	Car(String color){
		this.color = color;
	}
	Car(int door){
		this.door = door;
	}
	Car(String color, String model){
		this.color = color;
		this.model = model;
	}
	Car(String color, int door){
		this(color, "SM7", door);
//		System.out.println("Car 생성자 호출");
	}
	
	Car(String color, String model, int door){
		System.out.println("매개변수가 3개인 생성자"); // 실행문이 앞에와도 뒤에와도 상관없음 
		this.color = color;
		this.model = model;
		this.door = door;
	}
}
