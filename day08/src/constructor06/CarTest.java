package constructor06;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car("black","제네시스",5);
		System.out.println("car1의 색상 : " + car1.color);
		System.out.println("car1의 모델명 : " + car1.model);
		System.out.println("car1의 문수 : " + car1.door);
		
		Car car2 = new Car("white","스포츠카",3);
			System.out.println("car2의 색상 : " + car2.color);
			System.out.println("car2의 모델명 : " + car2.model);
			System.out.println("car2의 문수 : " + car2.door);
			
	}

}
