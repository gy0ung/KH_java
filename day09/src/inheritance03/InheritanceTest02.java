package inheritance03;

//aa만 사용가능
class AA {
	int i, j;
	
	// 값을 넣어줄때 주로 set이라고 이름을 붙여주고 (뒤에는 변수명을 붙여줌)
	// ↓ i와 j의 값을 넣어준다 라는 의미
	void setIJ(int x, int y) {
		i = x;
		j = y;
	}
	
	// 값을 가져올때는 주로 get이라고 이름을 붙여주고 (뒤에는 변수명을 붙여줌)
	// ↓ z의 값을 가져온다는 의미
	int z;	
	int getZ() {
		return z;
	}
	
}

// aa와 bb 사용가능
class BB extends AA {
	int total;
	int sum() {
		total = i+j;
		return total;
	}
}


// 클래스 앞에 public은 한클래스에만 가능
public class InheritanceTest02 {
	public static void main(String[] args) {
		BB b1 = new BB(); 
		b1.setIJ(30, 70);
		System.out.println(b1.sum());

	}

}
