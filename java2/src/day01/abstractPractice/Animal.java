package day01.abstractPractice;

public abstract class Animal {
	// 추상 클래스
	// 추상 메서드가 하나라도 있다면 추상 클래스로 선언해야 한다.
	// class 예약어 앞에 abstract를 붙여
	// 추상 클래스로 만들 수 있다.
	// 추상 메서드가 없더라도 추상 클래스로 선언할 수 있다.
	public void eat() {
		System.out.println("동물은 음식 섭취를 한다.");
	}
	
	// 추상 메서드
	// 반환타입(void) 앞에 abstract를 붙여
	// 추상 메서드로 선언할 수 있으며
	// 추상 메서드는 중괄호{}(구현부, 바디)를 작성하지 않고
	// 세미콜론;으로 마지막 부분을 닫아준다.
	public abstract void sleep();
	
	public static void main(String[] args) {
		Animal ani = new Person();
		ani.sleep();
	}
	
	
}
