package byteStream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamAPI {
	// ■ 바이트 기반 스트림 : 
	//     - 바이트 스트림 : 1byte단위로 전송하는 통로
	//     - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
	
	// XXXInputStream : XXX매체로부터 데이터를 직접 입력받는 통로
	// XXXOutputStream : XXX매체로부터 데이터를 직접 출력하는 통로
	
	// 프로그램으로부터 → 외부매체로 내보내기(파일)
	public void fileSave() {
		// FileOutputStream : 파일의 형태로 직접적으로 연결하여 1byte 단위 출력하는 스트림
		
		// ■ 순서
		// 1. 스트림 생성(통로만들기)
		// 2. 스트림으로 데이터를 출력
		// 3. 다 사용한 후 스트림 반납
		
		FileOutputStream fout = null;
		
		try {
			// 1. 스트림 생성(통로만들기)
			fout = new FileOutputStream("a_byte.txt");
								// ↑ 파일이 없으면 만들고, 있으면 덮어쓰기 하시오.
//			fout = new FileOutputStream("a_byte.txt",true); 
						// ↑ 파일이 없으면 만들고, 있으면 기존파일내용에 이어서 쓰시오.
			
			// 2. 스트림으로 데이터를 출력
			fout.write(97); // a
			fout.write('b');
			
			byte[] arr = {99,100,101}; // c,d,e
			fout.write(arr);

			fout.write(arr,1,2); // (arr,인덱스번호,갯수) / 덮어쓰기 

//			fout.write('랑'); // 2byte는 깨져서 들어감
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // finally는 꼭 실행해야한다는 코드로 없어도됨
			try {
			// 3. 다 사용한 후 스트림 반납
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ■ 프로그램 ← 파일 입력 (데이터 가져오기)
	public void fileRead() {
		
		// FileInputStream : 파일로부터 1byte단위로 입력받는 스트림
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("a_byte.txt");
			
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			
//			System.out.println(fin.read());
			
			// while문으로 쓰면 퐁당퐁당 출력된다. 조건식의 read()도 호출된걸로 인식
		/*	while(fin.read() != -1) {
				System.out.println(fin.read());
			} */
			
			// 해결방법 1. 무한반복을 돌면서 매번 검사
		/*	while(true) {
				int value = fin.read();
				if(value == -1)
					break;
				System.out.println(value);
			} */
			
			// 해결방법 2. 권장사항
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}
