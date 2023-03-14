package generics;

// 대부분 대문자 한글자를 쓴다 ex) <T>
//                   여기는 Object만 들어 올 수 있다.
public class Parking<T> {
	private T[] elems;
	private int index;
	
	public Parking() {
		this.elems = (T[]) new Object[16]; // T[] T타입의 배열로 강제형변환
	}
	
	public void add(T t) {
		this.elems[index++] = t;
	}
	
	public T get(int index) {
		return this.elems[index];
	}
	
	public int size() {
		return this.index;
	}
	
	public int indexOf(T t) {
		// 반복문으로 elems배열에서 객체 t를 검색하여 있으면 해당 인덱스번호 반환
		for(int i=0; i<index; i++) {
			if(this.elems[i].equals(t)) {
				return i;
			}
		} 
		// 찾는 객체가 없으면 -1로 반환
		return -1;
	}
	
}
