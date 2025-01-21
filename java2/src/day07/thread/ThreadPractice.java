package day07.thread;

import java.sql.Time;

public class ThreadPractice {

	public static void main(String[] args) {
//		쓰레드
//		쓰레드를 사용하는 두 가지 방법
//		클래스를 선언할 때 extends를 이용해 Thread 클래스를 상속받는다.
//		객체화할 때 생성자의 인수로 Runnable 인터페이스를 구현한
//		객체를 전달한다.

		// 스레드가 실행할 작업 정의
		Runnable r1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("thread1: " + i);
				try {
					// sleep()은 밀리초 단위로 해당 쓰레드를
					// 일시적으로 대기 시키는 명령어, 기능이다.
					Thread.sleep(1000); // 1000밀리초=1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable r2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("thread2: " + i);
				try {
					// sleep()은 밀리초 단위로 해당 쓰레드를
					// 일시적으로 대기 시키는 명령어, 기능이다.
					Thread.sleep(1000); // 1000밀리초=1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		// 스레드 객체화
		Thread thread1 = new Thread(r1);

//		두번째 쓰레드 생성
		Thread thread2 = new Thread(r2);

		// 두 개 쓰레드 실행 시작
		// 멀티 쓰레드
		thread1.start();
		thread2.start();

	}

}
