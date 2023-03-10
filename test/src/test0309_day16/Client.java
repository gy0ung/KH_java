package test0309_day16;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = null;
		BufferedReader br = null;

		
// ip와 포트 주소가 잘못됨
//		String serverIp = "192.168.50.5";
		int port = 5555;

		String trueLove = "♡Ο-łł 살고 ♡Ο-łł 죽는⊂ŀ_☆";
		Socket socket = null;

		

		try {
			String serverIp = InetAddress.getLocalHost().getHostAddress();
			socket = new Socket(serverIp, port);
			System.out.println(trueLove + "님의 채팅방에 접속하셨습니다.");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());

			while (true) {
				System.out.print(trueLove + "님에게 보낼 메세지 : ");
				String send = sc.nextLine();
				
				// 조건문으로 클라이언트가 안녕...을 쳤을때 종료하도록 함 
				if(send.equals("안녕...")) {
					System.out.println("채팅이 종료되었습니다.");
					break;
				}

				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[a HH:MM:ss]");
				// 오전오후를 반영하는 a를 넣어준다

				String time = sdf.format(d);
				pw.println(time + send);
				pw.flush();
				
				String message = br.readLine();
				System.out.println(trueLove + "님에게 받은 메세지 : " + message);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
				socket.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
