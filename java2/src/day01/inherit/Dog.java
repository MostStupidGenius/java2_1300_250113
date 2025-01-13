package day01.inherit;

public class Dog extends Animal { // Animal 클래스를 상속받는다.
	// 상속 받으려면 extends 예약어를 적어 그 뒤에
	// 상속받을 부모 클래스 이름을 적는다.
	// 상속은 최대 1개만 가능하다.(다중 상속 지원x)
	
	public Dog(String name, int age, String gender) {
		super(name, age, gender);
		
	}

	// 부모로부터 상속받은 메서드를 재정의하는 것을
	// 오버라이드(override)라고 하며
	// 기존 부모 클래스가 사용하던 메서드를 가리고
	// 새로 정의한 내용으로 사용한다.
	@Override // 어노테이션
	// 어노테이션은 코드 외에 컴파일러가 알아야 할 메타정보를
	// 표시해놓은 것이다.
	public void bark() {
		// super는 부모클래스를 가리키는 대명사 예약어다.
		// super.bark()는 부모클래스에 정의된 bark()메서드를
		// 사용하는 것이다.
//		super.bark();
		// 이 아래에 추가할 내용을 작성하면 된다.
		System.out.println("멍멍 짖습니다.");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog("바둑이", 13, "male");
		d.bark();
	}
	
}
