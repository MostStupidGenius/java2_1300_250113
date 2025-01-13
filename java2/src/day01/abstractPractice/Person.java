package day01.abstractPractice;

public class Person extends Animal {

	// 부모클래스에 정의된 추상 메서드는
	// 반드시 재정의해야 하는 강제성이 부여된다.
	@Override
	public void sleep() {
		System.out.println("사람은 누워서 자야 한다.");
	}

}
