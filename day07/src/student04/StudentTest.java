package student04;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();
		
		student.name ="홍길동";
		student.num = 20230101;
		student.grade = 4;
		student.major = "정보공학";
//		student.className = "자바";
		
		
		
		System.out.println("학생 이름 : " + student.name);
		System.out.println("학생 학번 : " + student.num);
		System.out.println("2022년 학년 : " + student.grade);
		System.out.println("학생 전공 : " + student.major);
		System.out.println("듣는 강좌명 : " + student.className);
		
		System.out.println("================");
		
		student.className("자바기본기");
		
		student.gradeUp();
		System.out.println("2023년 학년 : " + student.grade);

//		student.name("아무개");
		System.out.println("개명한 이름 : " + student.name("김민경"));
//		System.out.println(student.name);
		System.out.println("학생 이름 : " + student.name);
		
		System.out.println("================");
		
//		String[] str = new String[100];
//		int[] num = new int[100];
		
		Student[] st = new Student[100];
		for(int i=0; i<st.length; i++) {
			st[i] = new Student();
			st[i].num = 20230101+i;
		}
		System.out.println(st[0].num);
		System.out.println(st[1].num);
		System.out.println(st[2].num);
		System.out.println(st[3].num);
	}

}
