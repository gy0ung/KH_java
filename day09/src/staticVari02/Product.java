package staticVari02;

public class Product {
	static int count; // ++count; ▶ 0 → 1
	int proNo = 20230000; // proNo += count; ▶ 20230000 + 1 = 20230001 
	
/*    ↓ 인스턴스 블럭 
	{
		++count;
		proNo = count;
	}     인스턴스 블럭을 사용해도 무관하나 주로 생성자로 많이 사용한다. 
*/	
	Product() {
		++count;
		proNo += count;
	}
}
