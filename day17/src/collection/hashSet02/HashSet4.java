package collection.hashSet02;

import java.lang.reflect.Member;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class HashSet4 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동",24));
		set.add(new Person("아무개",20));
		
		System.out.println("size : " + set.size());
		iteratorPrint(set.iterator());
		System.out.println();
	}

	static void iteratorPrint(Iterator<Person> i ) {
		while(i.hasNext()) {
			System.out.print(i.next() + " "); 
			// toString 오버라이딩 하지 않고 출력하였을때 / ↓ 패키지명.클래스명@주소
			// collection.hashSet02.Person@1eb44e46 collection.hashSet02.Person@6f2b958e 
			System.out.println();
			Person p = i.next();
			System.out.print(p.name + ", "); // 인스턴스변수에 접근 가능할 경우
			System.out.print(p.age + "\t");
//			System.out.print(p.getName + ", "); // 인스턴스변수에 접근 불가할 경우
//			System.out.print(p.getAge + "\t");
			
			
			
		}
		System.out.println();
	}
}
