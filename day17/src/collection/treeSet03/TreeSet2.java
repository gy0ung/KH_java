package collection.treeSet03;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		
		while(set.size() < 6 ) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
	}

}
