package day05.stream.operMid;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperMid {

	public static void main(String[] args) {
//		중개 연산
//		stream의 요소들을 특정 기능을 통과하여 값이 변경되거나
//		조건에 따라 걸러지는 등의 동작을 수행하는 연산을
//		의미한다.
//		1. 스트림 필터링
//		filter(), distinct()
		Stream<Integer> streamInt = Stream.iterate(1, n -> n + 1).limit(100);
		
//		스트림의 값이 든 요소 중 짝수인 값만 새로운 스트림으로 만들어
		streamInt
			.filter(e -> e % 2 == 0) // 가져오는 값을 짝수로 제한한다.
//		출력한다.
			.forEach(e->System.out.println(e));
		
//		1-2. 중복 제거
//		.distinct()
		IntStream streamInt1 = IntStream.of(
				1, 3, 2, 3, 1, 5, 4, 8, 8
		);
		streamInt1.distinct()
			.forEach(e->System.out.println(e));
		
		
		System.out.println("=================");
//		2. 스트림 변환
//		.map(함수)
//		map 함수는 전달되는 요소들을 매개변수에 담아 실행할
//		람다식 등의 함수를 map()함수에 사용하고자 한다.
		Stream<String> streamStr = Stream.of(
			"C", "C++", "Java", "Python"
		);
		
//		글자 길이를 추출하여 출력하는 프로그램 작성
		streamStr
			.map(e->e.length()) // e.length() 함수를 통해
			// 문자열의 길이를 가져온다.
			.forEach(e -> System.out.println(e));
		
//		3. 스트림의 제한
//		개수 제한
//		.limit(최대 개수)
//		0번째부터 최대 개수-1번째까지 들고 온다.
		streamInt = Stream.iterate(1, n -> n + 1).limit(10);
		streamInt.forEach(e -> System.out.println(e));
		
		
		System.out.println("=====skip=====");
//		.skip(건너뛸 요소 개수)
//		건너뛸 요소의 개수만큼 건너뛴 뒤, 나머지 전부를 들고 온다.
		streamInt = Stream.iterate(1, n -> n + 1).skip(10).limit(10);
		streamInt.forEach(System.out::println);
		
//		4. 스트림 정렬
//		.sorted()
//		주어진 비교자(comparator)를 이용하여 정렬한 스트림을 반환한다.
//		비교자를 전달하지 않으면 기본적으로 사전순(natural order)으로 정렬된다.
		streamInt1 = IntStream.of(
				1, 3, 2, 3, 1, 5, 4, 8, 8
		);
		streamInt1.sorted().forEach(System.out::println);
		
//		5. 스트림 연산 결과 중간 확인
//		.peek()
//		결과 스트림으로부터 요소를 소모하여 추가로 명시된 동작을
//		수행한다.
//		이 기능은 원본 스트림에서 요소를 소모하는 것이 아니기 때문에
//		주로 연산과 연산 사이의 결과를 확인하고 싶을 때 사용한다.
//		디버깅 용도로 많이 사용한다.
		System.out.println("===peek===");
		streamInt1 = IntStream.of(
				1, 3, 2, 3, 1, 5, 4, 8, 8
		);
		streamInt1
			.filter(e -> e % 2 == 0)
//			.peek(System.out::println)
			.map(e -> e*2)
//			.peek(System.out::println)
			.limit(3)
			.peek(System.out::println)
			.forEach(System.out::println)
			;
	}

}
