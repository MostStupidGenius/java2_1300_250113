package day05.stream.operMid;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
//		스트림API
//		스트림 선언
//		seed의 값부터 func의 기능을 통해 무한히 많은 값을 가지는 
//		stream을 만드는 기능 .iterate(seed, func)
//		Stream<담은 값의 타입> 변수명 = Stream.iterate(seed, func)
		Stream<Integer> intStream = Stream.iterate(1, e -> e + 1);
		intStream.limit(50).forEach(e -> System.out.println(e));

//		ArrayList 객체를 복사하여 그 복사본을 stream으로
//		변환하는 기능
//		.stream()
//		arrList.stream()

		ArrayList<Integer> arrList = new ArrayList<Integer>();
//		arrList.add(1);
//		arrList.add(2);
//		arrList.add(3);
//		arrList.add(4);
//		arrList.add(5);
//		arrList.add(6);
		for (int i = 0; i < 10; i++) {
			arrList.add(i); // 0 ~ 9
		}

		Stream<Integer> ints = arrList.stream();
		ints.filter(e -> e % 2 == 0)
			.forEach(e -> System.out.println(e));
	}

}
