package day07.streamIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTryWithResources {

	public static void main(String[] args) {
//		파일 입출력을 간단히 하도록 도와주는 문법
//		try-with-resources
//		스트림을 사용 후에는 반드시 close() 함수를 호출하여
//		리소스를 해제해야 한다.
//		이를 try-with-resources를 사용하면 자동으로 처리할 수 있다.
//		try(스트림으로 쓸 객체 변수 선언 및 초기화){}catch(예외처리){}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt"));
				BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));) {
			// 파일 입출력 코드 작성
			// 이 안에서는 .close()로 리소스 해제할 필요가 없다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
