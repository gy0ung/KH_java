package collection.linkedList01;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// 추가 add
		list.add(new Integer(99));
		list.add(Integer.valueOf(10));
		list.add(8);
		list.add(20);
		list.add(3);
		
		for(int i : list) System.out.print(i + " ");
		System.out.println();
		
		// 삭제 remove
		list.remove(1); // index번호에 해당하는 노드 삭제
		for(int i : list) System.out.print(i + " ");
		System.out.println();
		
		list.remove(); // index번호 안넣으면 무조건 맨 앞에 삭제 
		for(int i : list) System.out.print(i + " ");
		System.out.println();
		
		list.removeFirst(); // 맨 앞을 삭제 인덱스안넣을경우의 .remove()와 동일
		list.removeLast(); // 맨 뒤를 삭제 
		
		LinkedList<Student> stuList = new LinkedList<Student>();
		stuList.add(new Student("홍길동",23));
		stuList.add(new Student("아무개",24));
		for(Student i : stuList) System.out.print(i + " ");
		System.out.println();
		
	}

}
