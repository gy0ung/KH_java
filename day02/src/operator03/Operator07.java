package operator03;

public class Operator07 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		
		x = 40;
		y = -9;
		z = 0;
		
		absX = x >= 0? x : -x;
		System.out.println(absX);
		absY = y <= 0? y : -y;
		System.out.println(absY);
		absZ = z >= 0? z : -z;
		System.out.println(absZ);
		System.out.println("1.------------");

		// Q1) +40 / -9 / 0 출력
		
		String signx = x > 0 ? "+" + x : ""+x;
		System.out.println(signx);
		String signy = y > 0 ? "+" + y : ""+y;
		System.out.println(signy);
		String signz = z > 0 ? "+" + z : (z==0? ""+z : ""+z);
		System.out.println(signz);
	}
}
