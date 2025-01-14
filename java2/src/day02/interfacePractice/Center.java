package day02.interfacePractice;

public class Center {

	public static void main(String[] args) {
//		각각의 데이터 센터 클래스는 데이터를 보내는 메서드의 이름이
//		제각각이다.
//		때문에 인터페이스를 쓰기 전엔 아래와 같이 써야 했다.
		DataCenter1 dc1 = new DataCenter1();
		DataCenter2 dc2 = new DataCenter2();
		DataCenter3 dc3 = new DataCenter3();
		
//		데이터 생성
		String data = "로우 데이터";
		
//		dc1.sendData(data);
//		dc2.request(data);
//		dc3.send(data);
//
//		부모에 해당하는 인터페이스 Transfer 타입으로
//		upcasting 된 자식 클래스의 객체들이
//		Transfer 배열에 담겨 일괄적으로 다룰 수 있다.
//		이를 통해 한꺼번에 많은 데이터를 다룰 수 있게 된다.
		Transfer[] trans = new Transfer[]{dc1, dc2, dc3};
		for(Transfer t : trans) {
			t.requestData(data);
		}
		
	}

}
