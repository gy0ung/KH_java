package calendar01.test02_T;

public class FusionData {
	// 메서드
	void stuAdd() {
		Student[] fusionStudent = new Student[2];
		fusionStudent[0] = new Student("20230001","홍길동",98,"서울특별시","010-1111-2222",true);
		fusionStudent[1] = new Student("20230002","아무개",56,"서울특별시","010-1111-3333",false);
		
		for(int i=0; i<fusionStudent.length; i++) {
			Student stu = fusionStudent[i];
			// System.out.println(stu);  // 오버라이딩한 toString() 호출
			System.out.println(stu.getName()+"\t"+stu.getJumsu()+"\t"+stu.getTel());
		}
	}
}
