package collection05.vector01;

import java.util.ArrayList;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		// 매개변수로 어떠한 객체든 다 받겠다. *권장하지 않음*
		// Vector는 throws를 많이 돌려 동기화를 할때 사용 그외 주로 ArrayList를 사용
//		Vector v = new Vector();
		
		// ArrayList와 Vector는 사용방법이 똑같다. *주로 ArrayList를 사용*
		
		ArrayList v = new ArrayList();
		
		v.add(1); // 정수로 넣었으나 객체로 인식
		v.add(8.98); // 실수로 넣었으나 객체로 인식
		v.add("478"); // String 객체
		v.add(new Integer(8));
		v.add(new Double(6.89));
		v.add(new String("kh정보교육원"));
		
		Object obj = v.get(0); // 객체타입으로는 넣을수있음
		
		int a = (int)v.get(0); // 객체를 int타입으로 넣을시 오류발생하여 타입변환
		System.out.println(a);
		
		double d = (double)v.get(1); // double타입으로 타입변환
		System.out.println(d);
		
		int i3 = Integer.parseInt((String)v.get(2)); // String일때 꼭!
		System.out.println(i3*3);
		
		int i4 = (int)v.get(3);
		System.out.println(i4);
		
	}

}
