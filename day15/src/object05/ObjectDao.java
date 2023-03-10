package object05;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectDao {
	// 프로그램 → 파일 (출력)
	public void fildSave() {
		Phone ph1 = new Phone("아이폰", 1800000);
		Phone ph2 = new Phone("갤럭시", 1700000);
		Phone ph3 = new Phone("갤럭시노트", 21000000);
		
		// FileOutputStream : 1byte 기반 스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조 스트림
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			oos.writeObject(ph1); // 직렬화를 하지 않았기 때문에 예외가 발생
			// phone클래스에 implements Serializable로 직렬화를 해주어야함
			oos.writeObject(ph2);
			oos.writeObject(ph3);
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 프로그램 ← 파일 (입력)
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject()); 
			*/
			
			while(true)
				System.out.println(ois.readObject());
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일이 다 끝났습니다.");
			// ↑ 순서가 밑에있으면 있으나마나 (IOException e) 보다 위에 있어야함
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/*	
		// 이렇게 하나로 해도되나, 각 예외마다 실행문을 다르게 해주기위해선
		// 각각 설정하는것이 좋다.
		} catch(EOFException e) {
			System.out.println("파일이 다 끝났습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} 
		*/
			
	} 
	
	
	
}
