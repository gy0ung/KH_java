package student04;

public class Student {
	String name;
	int num;
	int grade;
	String major;
	String className;
	
	void className(String className1) {
		className = className1;
		System.out.println(className);
	}
	void gradeUp() {
		++grade;
	}
	String name(String rename) {
		name = rename;
		return name;
	}
	
}
