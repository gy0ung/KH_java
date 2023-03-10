package test02;

public class FusionData {
	// 메서드생성하여 넣어줌
	void stuAdd() {
	Student[] fusionStudent = new Student[28];
	fusionStudent[0] = new Student("20230001","홍길동",98,"서울특별시","010-1111-2222",true);
	fusionStudent[1] = new Student("20230002","아무개",56,"서울특별시","010-1111-3333",false);
	
//	fusionStudent[0].getStuNo();
//	fusionStudent[0].getName();
	System.out.println(fusionStudent[0].getStuNo());
	System.out.println(fusionStudent[0].getName());
	System.out.println(fusionStudent[0].getScore());
	// ↓ toString이 호출됨
	System.out.println(fusionStudent[0]);
	
	}
	
}
