package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		HashMap hm = new HashMap(); // 제네릭을 사용하지않을때 
		HashMap<String,Snack> hm2 = new HashMap(); // 제네릭을 사용할때 
		
		// 계층구조
		// List계열, Set계열은 Collection 구현한 클래스
		// → 객체를 추가할 때 add()메소드 사용
		
		// map계열은 Collection 상속받아서 구현한 클래스가 아니다
		// → 추가하고자 할때 put()메소드 이용 (이때, key+value 세트로 담아야됨)
		
		// 1. put(K key, V value)
		hm.put("다이제스트", "초코맛");
		hm.put("다이제스트", new Snack("초코맛", 1500));
		hm.put("칸쵸", new Snack("단맛",600));
		hm.put("새우깡", new Snack("고소한맛",400));
		hm.put("포테토칩", new Snack("짠맛",500));
		System.out.println(hm); // ← toString 오버라이딩 해서 출력되는것
		
		
		System.out.println("--제네릭사용--");
//		hm2.put("다이제스트", "초코맛"); // 제네릭때문에 String,Snack형식으로 써야함
		hm2.put("다이제스트", new Snack("초코맛", 1500));
		hm2.put("칸쵸", new Snack("단맛",600));
		hm2.put("새우깡", new Snack("고소한맛",400));
		hm2.put("포테토칩", new Snack("짠맛",500));
		System.out.println(hm2); 
		
		System.out.println();
		// K key는 중복을 허용하지않는다 : 같은 키가 들어오면 값이 덮어쓰기가 된다.
		// V value 값의 중복은 허용한다.
		hm.put("새우깡", new Snack("달콤한맛",500));
		System.out.println(hm);
		
		hm.put("오징어칩", new Snack("달콤한맛",500));
		System.out.println(hm); 
		
		// 2. get(Object key) : 해당 키값의 value을 반환시켜주는 메서드
		// Object value = hm.get("다이제스트");
		Snack s = (Snack) hm.get("다이제스트");
		Snack s2 = hm2.get("다이제스트"); // 제네릭을 사용했을때 형변환 하지않아도됨
		System.out.println(s);
		
		// 3. size() : 담겨져있는 객체의 객수 변환
		System.out.println("객체의 수 : " + hm.size());
		
		// 4. replace(K key, V value) → 해당 키를 찾아서 value값을 변경 해줌
		hm.replace("포테토칩",new Snack("겁나짠맛",700));
		System.out.println(hm);
		
		System.out.println("=========================");
		
		
		// map안의 모든 키 값과 value값을 출력하고자 할 때
		// ↓ 바로 사용 안됨
		// 	for( : hm) ← 
		// 	Iterator 반복자를 이용 / Iterator it = ((Object) hm).iterator();
		
		// ↓ Map을 Set으로 바꿔 사용
		// 	Map을 Set으로 바꿔주는 메소드 제공(2개)
		// 	1. keySet()을 이용하는 방법
		// 	  Map → Set → Iterator
	
		// 	  1) hm에 있는 키들만 Set에 담기 (키들의 집합 형태)
		// 			hm.keySet() → Set으로 변경
		Set keySet = hm.keySet();
		Set<String> keySet2 = hm2.keySet();			  // -------1.제네릭으로 넣어주면
		
		//	  2) keySet을 Iterator에 담기
		Iterator itkey = keySet.iterator();
		Iterator<String> itkey2 = keySet2.iterator(); // -------2.제네릭으로 넣어주면 
		
		//	  3) 반복문을 이용하여 값 얻어오기
		
		while(itkey.hasNext()) {
			String key = (String) itkey.next();
			Snack value = (Snack) hm.get(key);
			System.out.println(key + " = " + value);
		}
		
		System.out.println("--제네릭사용--");
		while(itkey2.hasNext()) {
			String key2 = itkey2.next(); 			  // -------3.쓰지않아도됨 
			Snack value2 = hm2.get(key2);
			System.out.println(key2 + " = " + value2);
		}
		
		System.out.println("--------------------------------");
		
		// 2. entrySet()을 이용하는 방법 ▶ map에서는 entrySet()을 주로 사용한다.
		//	  1) hm.entrySet() : 키 + 값
		Set entrySet = hm.entrySet();
		Set<Entry<String, Snack>> entrySet2 = hm2.entrySet();
		
		//	  2) entrySet.iterator() : 담기
		Iterator itEntry = entrySet.iterator();
		Iterator<Entry<String, Snack>> itEntry2 = entrySet2.iterator();
		
		//	  3) 반복문을 통해 가져오기
		while(itEntry.hasNext()) {
			Entry entry = (Entry) itEntry.next();
			String key = (String) entry.getKey();
			Snack value = (Snack) entry.getValue();
			System.out.println(key + " = " + value);
		}
		
		System.out.println("--제네릭사용--");
		while(itEntry2.hasNext()) {
			Entry<String, Snack> entry2 = itEntry2.next();
			String key2 = entry2.getKey();
			Snack value2 =  entry2.getValue();
			System.out.println(key2 + " = " + value2);
		}
		
	}

}
