package day08.streamIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileIO {

	public static void main(String[] args) {
//		파일 입출력(byte)
//		직전에 배웠던 파일 입출력은 reader, writer를 이용한
//		텍스트 파일 입출력이었다.
//		이번에는 텍스트를 포함한 "파일" 입출력에 대한 내용이다.
		try (FileInputStream fis = new FileInputStream("test.txt");
				FileOutputStream fos = new FileOutputStream("ouput.txt");) {
			// 파일로부터 읽은 한 단위의 데이터를 임시로 담을 변수 
			int data; // 선언만 하는 것은 아래에서 값을 덮어씌울 것이기 때문이다.
			
			// fis를 통해 데이터를 입력받고, 이를 반복적으로
			// fos로 써내는 반복문
			while((data = fis.read()) != -1) {
				// data로 써온 내용이 -1(내용없음)이 아니라면 반복 실행
				
				// fos를 통해 읽어온 데이터를 그대로 내보낸다.
				fos.write(data);
				// try-with 구문을 썼기 때문에, .close()를 쓰지 않는다.
			}
			System.out.println("작업 완료");
		} catch (IOException e) {
//			e.printStackTrace();
			System.err.println(e);
		}

	}

}
