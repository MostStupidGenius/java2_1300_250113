package day02.interfacePractice.task;

public class Sparrow extends Bird implements Fly {
//	참새 클래스는 새 클래스를 상속 받고
//	Fly 클래스를 구현해야 하는 일반 클래스다.
	@Override
	public void fly() {
		System.out.println("작은 날개로 빠르게 난다.");
	}

}
