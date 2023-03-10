package file01;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		// File생성은 꼭 try/catch문으로 하여 생성해야함. throws???
		// 없는 폴더안에 생성할수 있기때문에 꼭 try/catch문을 이용하여 만들어야한다고 지정

		try {
			// 경로를 지정하지 않고 파일 만들기
			File f1 = new File("test.txt");
			f1.createNewFile(); // 반드시 메소드까지 호출해야만 파일이 만들어짐
			
			// 존재하고 있는 폴더에 파일 생성 : 경로 지정
			File f2 = new File("D:\\test.txt"); // D드라이브에 파일생성
//			File f2 = new File("D:/test.txt"); // 위의 코드와 동일 ( / == \\ )
			f2.createNewFile(); // 반드시 메소드까지 호출해야만 파일이 만들어짐
			
			// 폴더 만들기
			File tempfolder = new File("D:/temp");
			tempfolder.mkdir(); // 폴더생성 
					// temp라는 디렉토리를 만드시오(mkdir은 폴더를 만들수있는 메서드) 
			File f3 = new File("D:/temp/test.txt"); // D드라이브에 파일생성
			f3.createNewFile(); 
			
			System.out.println(f1.exists()); // f1 파일이 존재하는지
			System.out.println(new File("ttt.txt").exists()); // new File("ttt.txt") 파일이 존재하는지
			
			System.out.println(f1.isFile()); // f1 파일인지 아닌지 
			System.out.println(tempfolder.isFile()); // tempfolder은 폴더라 파일이 아니라 false로 출력됨
			System.out.println("----------------------");
			
			// parent 폴더 만들기
			File parentfolder = new File("parent");
			parentfolder.mkdir();
			
			// parent 폴더안에 person.txt파일 만들기
			File file = new File("parent/person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
}
