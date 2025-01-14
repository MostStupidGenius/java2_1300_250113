package day02.interfacePractice;

public class DataCenter2 implements Transfer {

	@Override
	public void requestData(String data) {
		this.request(data);
	}
	
	void request(String data) {
		System.out.println(data + "를 전송합니다.");
	}

}
