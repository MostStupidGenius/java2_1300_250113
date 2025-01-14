package day02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
//		오류(Error)
//		예상치 못한 동작으로 프로그램의 실행에 큰 영향을 미칠 수 있을 때
//		이를 오류로 판단하여 프로그램을 강제 종료 시키는 것을 의미한다.
//		예외 처리(Exception ~)
//		특정 코드에서 발생할 수 있는 오류를 감지할 시스템을 만들어서
//		특정 오류가 발생했을 때, 미리 지정해놓은 동작을 시행한 후
//		프로그램 강제 종료에 대한 예외로 처리하여		
//		프로그램 종료 없이 프로그램을 이어서 진행하도록 만드는
//		오류 처리 방법을 가리킨다.
		
//		예외 처리는 try-catch-finally 코드 블록으로 이루어진다.
//		이때 try는 필수, 남은 둘은 택1이다.
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		try {
			System.out.print("정수 입력: ");
//			정수를 입력해야 하는데
			num1 = sc.nextInt();
//			특정 예외에 대한 감지를 실행하는 것
		}catch (InputMismatchException e) {
			System.err.println("입력하라는 값과 입력된 값의 타입이 다릅니다.");
			System.err.println(e);
//			Exception은 모든 예외 클래스의 최상위 클래스로
//			Exception을 대상으로 예외처리를 하면
//			모든 예외를 잡아낼 수 있다.
//			-> 프로그램을 종료해야 할 때에도 예외로 처리해버리기 때문에
//			Exception을 남용하면 안 된다.
		}catch (Exception e){ // 만약 잘못된 값을 입력한 경우
			// 이 코드 블록을 실행한다.
			num1 = 0;
			System.err.println(e);
		}finally {
//			오류 발생 여부와 무관하게 항상 실행되는 코드 블록
			sc.close(); // 스캐너는 닫아주어야 한다.
			System.out.println(num1);
		}
		
		try {
			// 0으로 나눌 수 없는 수식에 대해
			// 메서드를 작성한 쪽이 아닌
			// 메서드 사용자 쪽에서 예외를 처리하도록
			// throws를 사용한 예
			System.out.println(divide(3, 0));
		} catch (Exception e) {
			// 해당 오류에 대한 정보만 제공
			System.err.println(e);
			// 해당 오류가 발생한 각 위치에 대한 정보 제공
			e.printStackTrace();
		}
		
		
	}
	
	public static int divide(int num1, int num2) throws Exception {
		return num1 / num2;
	}
	
	
	
	
	

}
