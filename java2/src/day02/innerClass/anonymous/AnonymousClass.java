package day02.innerClass.anonymous;

public class AnonymousClass {

	public static void main(String[] args) {
//		익명 클래스
//		상속할 부모 클래스 혹은 인터페이스 이름으로 선언하며
//		그 부모의 메서드를 재정의한 자식클래스이지만.
//		자기자신의 타입없이 객체화하면서 동시에 부모 클래스로
//		upcasting 되어 사용되는 내부 클래스를 말한다.
		Pokemon pikachu = new Pokemon("피카츄", 3, 5) {
			@Override
			public void getInfo() {
				System.out.println(
						"이름: " + this.name
						+ "\n나이: "+ this.age
						+ "\n종족값: "+ this.IV);
			}
		};
//		익명 클래스를 선언하면서 메서드의 내용을 구현했기 때문에
//		해당 메서드를 사용할 수 있다.
		pikachu.getInfo();
		
	}

}
