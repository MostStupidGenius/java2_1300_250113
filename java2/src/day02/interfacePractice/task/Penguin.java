package day02.interfacePractice.task;

public class Penguin extends Bird implements Walk {
//	펭귄은 조류의 일종이라서 깃털은 있지만
//	날 수는 없다. -> Fly 인터페이스를 상속받지 않는다.
	@Override
	public void walking() {
		System.out.println("펭귄은 두 발로 뒤뚱뒤뚱 걷거나 슬라이딩한다.");
	}
	
}
