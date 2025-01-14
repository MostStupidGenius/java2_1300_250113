package day02.interfacePractice.task;

public class Bat extends Mammal implements Fly {
	@Override
	public void fly() {
		System.out.println("박쥐는 피막 날개로 날 수 있다.");
	}
}
