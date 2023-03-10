package collection.linkedList01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList(2000000);
		LinkedList l = new LinkedList();
		System.out.println("순차적으로 추가할 때 걸린 시간");
		System.out.println("ArrayList : " + add(a));
		System.out.println("LinkedList : " + add(l));
		
		System.out.println("중간에 추가할 때 걸린 시간");
		System.out.println("ArrayList : " + addM(a));
		System.out.println("LinkedList : " + addM(l));
		
		System.out.println("중간에 삭제할 때 걸린 시간");
		System.out.println("ArrayList : " + removeM(a));
		System.out.println("LinkedList : " + removeM(l));
		
		System.out.println("끝부터 모두 삭제할 때 걸린 시간");
		System.out.println("ArrayList : " + removeE(a));
		System.out.println("LinkedList : " + removeE(l));
		
	}
	
	static long add(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++)
			list.add(i + " ");
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	static long addM(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			list.add(5000,"m");
		long end = System.currentTimeMillis();
		return end-start;
	}

	static long removeM(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	static long removeE(List list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	
	
}
