package day10;

//다른 프로젝트안에 있는 클래스에 접근하기 위해서는 따로 설정 후 import 해주어야함
//사용하려는 프로젝트 우클릭 → properties → Java Build Path → Projects → classPath → add
//사용하려는 클래스가 있는 프로젝트를 추가 또는 위치를 모르는경우 전부 체크하여 추가
import phone05.SmartPhone; // 다른 프로젝트 안에 있는 클래스에 접근
import tv01.Tv; // 같은 프로젝트 안에 있는 클래스에 접근하는거라 import만 해주어도 접근가능.

public class Test {

	public static void main(String[] args) {
		Tv tv = new Tv();
//		tv.channal = 10;  // private기 때문에 접근할수없어서 오류발생.
//		tv.channalUp();   // public이 붙지않아서 접근할수없어서 오류발생. 
		tv.power();       // public으로 접근가능
		
		// 다른프로젝트안에 있는 클래스에 접근하기 위해서는 미리 알려주어야한다.
		SmartPhone sp = new SmartPhone(); // 같은 프로젝트 안에 없어서 오류발생. 
		sp.katalk("안녕"); // 다른 프로젝트 안에 있는 클래스에 public에 설정된 메서드 사용가능
		
		
		
		
	}

}
