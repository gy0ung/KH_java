package student03;

public class Student {
	static String class1;
	int stuNum;
	String name;
	String addr;
	String subName;
	static int tCount;
	
	String subjectName(String subName) {
		this.subName = subName;
		return this.subName;
	}
	static void totalCount(int tCount) { // 객체를 생성하지않고도 사용가능
		System.out.println("현재 수강인원 : " + tCount);
//		System.out.println("이름 : " + name); 
//		name을 사용하고자 하면 static String name;으로 변경해주어야한다. 
	}
}
