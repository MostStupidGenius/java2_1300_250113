package day02.interfacePractice;

public class DataCenter1 implements Transfer {
	// implements를 쓴 뒤 이 뒤에 인터페이스명을 적으면
//	// 해당 인터페이스의 추상 메서드를 구현해야 하는
	// 강제성을 가지게 된다.
	@Override
	public void requestData(String data) {
		// 인터페이스를 통한 시스템 통합
		this.sendData(data);
	}
	
	void sendData(String data) {
		System.out.println(data + "를 보냅니다.");
	}
}
