package student07;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(20230201,"홍길동","010-1111-1111");
		Student s2 = new Student(20230202,"아무개","010-2222-2222");
		Student s3 = new Student(20230203,"김수한","010-3333-3333");
		
		
		System.out.println("s1학생의 학번 : " + s1.stuNum);
		System.out.println("s1학생의 이름 : " + s1.name);
		System.out.println("s1학생의 전화번호 : " + s1.stuPhon);
		
		System.out.println("----------------------------");
		System.out.println("s2학생의 학번 : " + s2.stuNum);
		System.out.println("s2학생의 이름 : " + s2.name);
		System.out.println("s2학생의 전화번호 : " + s2.stuPhon);
		
		System.out.println("----------------------------");
		System.out.println("s3학생의 학번 : " + s3.stuNum);
		System.out.println("s3학생의 이름 : " + s3.name);
		System.out.println("s3학생의 전화번호 : " + s3.stuPhon);
		
		Car car1 = new Car("white");
		System.out.println("car1의 도어 갯수는 " + car1.door + "이고, 색상은 " + car1.color + "입니다.");
		Car car2 = new Car(2);
		Car car3 = new Car("yellow","제네시스");
		System.out.println("=================================");
		Car car4 = new Car();
		
	}

}
