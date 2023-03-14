package collection.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		try {
			// load(InputStream is)
//			prop.load(new FileInputStream("test.ptoperties"));
			
			// loadFromXML
			prop.loadFromXML(new FileInputStream("text.xml"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop);
	}
	// .properties 파일을 사용하는 경우
	// 프로그램상에서 필요한 기본 환경설정(서버의 ip주소, dbms경로...) 관련된 구문을 기술
	// → 모두 문자열이기 때문에 개발자가 아닌 일반 관리자가 해당 문서를 파악하여 수정하기 쉽다.
	
	// .xml 파일의 특징
	// 프로그래밍 언어들 사이에 있어 호환이 쉽다.

}
