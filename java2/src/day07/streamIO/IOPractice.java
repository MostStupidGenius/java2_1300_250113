package day07.streamIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOPractice {
	public static void main(String[] args) {
		// 파일 입출력
		// 파일을 읽거나 쓰기 위해서는 File 클래스 객체가 필요하다
		// 이러한 파일을 읽거나 쓰려면 그걸 도와줄 객체도 따로 필요하다.
		try {

			// 1. 파일 생성
			File file = new File("test.txt");

			// 만약 파일이 없다면 파일생성
			if (!file.exists()) {
				// 해당 파일 이름으로 생성
				file.createNewFile();
			}

			// 2. 파일에 데이터 쓰기
			// 데이터 쓰기 클래스 객체화
			FileWriter writer = new FileWriter(file);

			// buffered writer를 쓰기 위한 객체화
			BufferedWriter bw = new BufferedWriter(writer);

			// 3. 데이터 쓰기(write)
			bw.write("Hello World!\n");

			// 읽기/쓰기 객체를 사용한 후 반드시 닫아주어야 한다.
			// 리소스 해제
			bw.close();
			System.out.println("쓰기 성공");
			
			// 파일 읽기
			FileReader reader = new FileReader(file);
			
			// 버퍼드로 읽기 객체 사용
			BufferedReader br = new BufferedReader(reader);
			
			// 읽어오는 내용 한 줄을 담을 변수 선언
			String line;
			
			do {
				// 가져온 내용 순차적으로 읽기
				line = br.readLine();
				// 가져온 내용이 없다면 반복문 탈출
				if(line == null) break;
				
				// 가져온 내용이 있다면 출력
				System.out.println(line);
			}while(line != null);
			
//			while((line = br.readLine()) != null) {
//				System.out.println(line);				
//			}
			// 리소스 해제
			br.close();
			System.out.println("읽기 성공");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
