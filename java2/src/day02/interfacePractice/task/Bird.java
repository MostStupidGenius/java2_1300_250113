package day02.interfacePractice.task;

public abstract class Bird extends Animal {
//	부모 클래스로 Animal을 상속받은 새 클래스다.
//	새 클래스는 동물 중에서 깃털이 있는 동물이다.
	String git; // 깃털 속성
	public Bird() {;}
	
	public Bird(String name, int age) {
		super(name, age);
	}
	
	// 이 새 클래스에서 새로운 속성인 git을 만들었으므로
//	이를 받아줄 생성자를 만들어주어야 한다.
	public Bird(String name, int age, String git) {
		super(name, age);
		this.git = git;
	}
	
	
}
