package day01.inherit;

public class Cat extends Animal {
	public Cat() {;}
	
	public void scratcher() {
		System.out.println("고양이는 스크래칭을 한다.");
	}
	
	public static void main(String[] args) {
//		Cat 타입의 클래스 객체화
		Cat c = new Cat();
//		Animal 타입의 참조 변수 선언;
		Animal a = c; // 업캐스팅
		a.bark();
		// Animal클래스에서가 아니라 Cat 클래스에서 정의된
		// 메서드는 Animal 참조변수에 담긴 Cat 객체로서는
		// 사용할 수가 없다.
		
		// 자식클래스 Cat에서 정의된 메서드는
		// 부모클래스 Animal에 존재하지 않기 때문에
		// 업캐스팅될 때, Cat에서 만든 메서드는 숨겨진다.
		//-> 사용할 수 없다.
		// 다운캐스팅하여 Cat 타입을 가진 참조변수를 통해서만
		// 사용이 가능하다.
//		a.scratch();
		
		// 다운캐스팅
		// 업캐스팅된 객체가 하위의 클래스 타입 참조 변수로
		// 담기는 것을 의미한다.
		// 이때 소괄호()에 바꾸고자 하는 하위 클래스명을 적어
		// 명시적으로 다운캐스팅을 수행한다.
		Cat down = (Cat) a;
		down.scratcher();
	}
	
}
