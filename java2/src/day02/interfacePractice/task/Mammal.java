package day02.interfacePractice.task;

public abstract class Mammal extends Animal {
//	부모 클래스로 Animal을 상속받은 포유류 클래스이다.
//	포유류는 젖먹이 동물이다.
	public Mammal() {;}
	
	public Mammal(String name, int age) {
		super(name, age);
	}
	
//	젖먹이 행동에 대한 메서드
	public void mammal() {
		System.out.println("포유류는 젖먹이 동물이다.");
	}
	
	
	
}
