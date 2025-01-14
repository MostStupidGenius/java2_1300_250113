package day02.interfacePractice;

public class DataCenter3 implements Transfer {

	@Override
	public void requestData(String data) {
		this.send(data);
	}
	
	void send(String data) {
		System.out.println(data + "가 배송출발 했습니다.");
	}

}
