package day05.stream.task;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTask01 {

	public static void main(String[] args) {
//		Stream API 실습
//		Review
//		Stream 만드는 방법
		Stream<String> strs = Stream.of("홍길동", "홍당무", "고길동");
		
//		IntStream 만드는 방법
		// range(0, 100) -> 0부터 100미만까지 정수를 모두 만드는 스트림이다.
		IntStream is1 = IntStream.range(0, 100);
		
		// rangeClosed(0, 100) -> 0부터 100이하까지 정수를 모두 만드는 스트림이다.
		IntStream is2 = IntStream.rangeClosed(0, 100);
		
//		실습1
//		1부터 50까지의 수를 요소로 가지는 IntStream을 만들어서
		IntStream is3 = IntStream.rangeClosed(1, 50);
//		짝수만 filter하여
		is3.filter(e -> e % 2 == 0)
//		map으로 1을 증가시킨 뒤
		.map(e -> e + 1)
//		limit로 10개만 추출
		.limit(10)
//		forEach로 모든 요소를 출력
//		.forEach(e -> System.out.println(e))
		.forEach(System.out::println)
		;
		
//		실습2
//		collect 연습
//		IntStream으로 1부터 50까지 만들고
		IntStream iss = IntStream.rangeClosed(1, 50);
//		이 중 3의 배수인 숫자만 filter하여
		int resultInt = iss.filter(e -> e % 3 == 0)
//		collect를 이용하여
//		Collectors의 합계기능으로 모든 요소의 합을 받아보자.
//		.collect(Collectors.summingInt());
		.sum();
//		.getAs~()으로 값을 변경해야 할 수도 있다.
//		이를 변수에 담아 출력해보자.
		System.out.println("===sum===");
		System.out.println(resultInt);
	}
}
