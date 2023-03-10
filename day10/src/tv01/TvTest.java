package tv01;

public class TvTest {

	public static void main(String[] args) {
		SmartTv st1 = new SmartTv();
		st1.power();
		st1.channalUp();
		st1.seach("java");
		st1.netflix("피지컬100");
		st1.power();
	}

}
