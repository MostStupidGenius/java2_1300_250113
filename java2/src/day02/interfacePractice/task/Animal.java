package day02.interfacePractice.task;

public class Animal {
//	모든 동물 클래스들이 공통으로 가져가는
//	동물 클래스들의 최상위 클래스
	String name;
	int age;
	
	public Animal() {;}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
//		여러 동물 클래스로 만든 객체를 묶어서 관리해보자.
		Bat bat = new Bat();
		Sparrow spa = new Sparrow();
		Penguin peng = new Penguin();
		Whale whale = new Whale();
		
//		여러 동물을 묶어서 관리하기 위해
//		부모클래스 혹은 인터페이스 배열을 만들어서
//		요소로 객체를 담아둔다.
		Bird[] birds = new Bird[]{spa, peng};
		Mammal[] mams = new Mammal[] {bat, whale};
		
//		Mammal 클래스를 부모 클래스로 상속받은 객체들은
//		Mammal 클래스에 정의된 메서드를 사용할 수 있다.
		for (Mammal mammal : mams) {
			mammal.mammal();
		}
		
		Fly[] flyer = new Fly[] {spa, bat};
		for (Fly fly : flyer) {
			fly.fly();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
