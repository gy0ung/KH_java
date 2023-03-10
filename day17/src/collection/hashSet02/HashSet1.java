package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class A {
	String aa;
	
	public A(String aa) {
		this.aa = aa;
	}
}

public class HashSet1 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();  // 부모타입으로 형변환해서도 사용가능
		
		A a1 = new A("c");
		
		set1.add(new A("a"));
		set1.add(new A("b"));
		set1.add(a1);
		set1.add(new A("d"));
		set1.add(new A("e"));
		
		System.out.println("size : " + set1.size());
		
		// set의 5개의 객체를 Iterator타입의 변수 iterator에 넣음
		Iterator<A> iterator = set1.iterator();
		
		// hasNext() : 남아있는 객체가 있나? true, false
		// Next() : 순회하면서 값 얻어오기
		
		// 순서대로 안나옴 /  인덱스몇번 삭제 불가 (인덱스번호가 아예없다)
		System.out.print("set1 출력 : ");
		while(iterator.hasNext()) {
			A a2 = iterator.next();
			System.out.print(a2.aa + " ");
		}
		System.out.println();
		
		set1.remove(a1);
		
		System.out.print("set1 삭제 후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
		/*
		iterator = set1.iterator();
		while(iterator.hasNext()) {
			A a2 = iterator.next();
			System.out.print(a2.aa + " ");
		}
		System.out.println();
		*/
		set1.add(new A("e"));
		System.out.println("size : " + set1.size());
		
		System.out.print("set1에 e 입력 후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
		
		set1.add(a1);
		System.out.println("size : " + set1.size());
		System.out.print("set1에 a1 입력 후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
		set1.add(a1);
		System.out.println("size : " + set1.size());
		System.out.print("set1에 a1 한번 더 입력 후 출력 : ");
		iteratorPrint(set1.iterator());
		System.out.println();
		
		
	}
	
	static void iteratorPrint(Iterator<A> i ) {
		while(i.hasNext()) {
			A a2 = i.next();
			System.out.print(a2.aa + " ");
		}
	}

}
