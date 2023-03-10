package collection05.vector01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector vector = new Vector(); // 모든 객체 자료형을 받을 때
		ArrayList al = new ArrayList();
		
		List<Student>vlist = new Vector<>(); // 부모자료형으로 형변환, Student객체만 받을 때
		List alist = new ArrayList();
		
		vlist.add(new Student("아무개",480)); // 맨 끝에 삽입
		vlist.add(new Student("정보",30));
		vlist.add(new Student("김수한",27));
		vlist.add(new Student("거북이",5));
		vlist.add(new Student("두루미",150));
		
		alist.add(new Student("아무개",480));
		alist.add(new Student("정보",30));
		alist.add(new Student("김수한",27));
		alist.add(new Student("거북이",5));
		alist.add(new Student("두루미",150));
		
		vlist.remove(1); // index 1을 삭제
		
		for(int i=0; i<vlist.size(); i++) {
			Student student = vlist.get(i); // index의 객체 얻어오기
			System.out.println(student.getName() + "\t" + student.getStuNo());
		}
		System.out.println("---------------------------");
		
		alist.clear(); // 모두 삭제
		if(!alist.isEmpty()) {
			for(int i=0; i<vlist.size(); i++) {
				Student student = vlist.get(i);
				System.out.println(student.getName() + "\t" + student.getStuNo());
			}
		}else {
			System.out.println("데이터가 없습니다.");
			
		}
	}

}
