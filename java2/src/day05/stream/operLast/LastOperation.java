package day05.stream.operLast;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LastOperation {

	public static void main(String[] args) {
//		스트림 최종 연산
//		스트림 API에서 중개 연산을 통해 변환된 스트림은
//		마지막으로 최종 연산을 통해 각 요소를 소모하여
//		그 결과를 표시한다.
//		이렇게 최종 연산으로 모든 요소를 소모한 해당 스트림은
//		이후 사용이 불가하다.
		
//		1. ★요소의 출력
//		.forEach()
//		스트림의 각 요소를 순차적으로 소모하여
//		전달된 함수의 동작을 수행한다.
//		반환타입이 void이기 때문에 일반적으로
//		스트림의 모든 요소를 출력하는 용도로 많이 사용한다.
		
//		2. 요소의 소모
//		.reduce()
//		스트림의 요소를 소모하여 연산 수행한다.
//		처음 두 요소를 연산한 결과를 다음 요소와 연산,
//		그 결과를 또 다음 요소와 연산하는
//		"계단식"으로 연산을 수행한다.
		
//		.rangeClosed(start, end)
//		start값부터 end값까지(포함) 등차수열을 IntStream으로 만드는
//		기능을 하는 함수다.
//		1부터 100까지의 숫자를 만드는 코드
		IntStream intStream = IntStream.rangeClosed(1, 100);
//		모든 요소를 순차적으로 더하는 reduce()함수 구현
		int result = intStream
			.reduce((before, after) -> before + after)
//			reduce의 결과는 OptionalInt타입이기 때문에
//			getAsInt()함수를 이용해서 int 타입으로 변경해주어야 한다.
			.getAsInt();
		System.out.println(result);
		
//		3. 요소의 검색
//		.findFirst(), .findAny()
//		두 메서드 모두 해당 스트림에서 첫번째 요소를 참조하는
//		Optional 객체 반환한다.
//		★병렬 스트림의 경우 findAny()를 사용해야 한다.
		IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
		IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
		
//		첫번째 스트림을 정렬(sorted)한 후
//		가장 처음으로 오는 요소를 추출한다.
		OptionalInt result1 = stream1.sorted().findFirst();
		System.out.println(result1.getAsInt());
		
//		4. 요소의 검사
//		.anyMatch()
//		해당 스트림의 일부 요소가 특정 조건을 만족할 경우에 true 반환
//		.allMatch()
//		모든 요소가 특정 조건을 만족할 경우에 true 반환
//		.nonMatch()
//		allMatch의 반대(만족하지 않을 경우 true)
		stream1 = IntStream.of(30, 90, 70, 10);
		stream2 = IntStream.of(30, 90, 70, 10);
		
//		stream1의 요소 중 하나라도 90이상이면 true 반환
		boolean resultBool = stream1.anyMatch(e -> e >= 90); // true
		boolean resultBool2 = stream2.allMatch(e -> e < 90); // false
		System.out.println(resultBool + " " + resultBool2);
		
//		5. ★요소의 통계
//		.count()
//		해당 스트림의 요소의 총 개수를 long타입의 값으로 반환
		stream1 = IntStream.of(30, 90, 70, 10);
		System.out.println(stream1.count());
		
//		max(), min()
//		요소 중 가장 큰(작은) 값을 가지는 요소를 Optional 객체로 반환
		stream1 = IntStream.of(30, 90, 70, 10);
		System.out.println(stream1.max().getAsInt());
		
//		6. ★요소의 연산
//		.sum()
//		모든 요소의 합을 구하는 sum()
		stream1 = IntStream.of(30, 90, 70, 10);
		System.out.println(stream1.sum()); // 200
		
//		.average()
//		전체 요소의 평균을 구한다.
//		결과 값이 OptionalDouble로 반환된다.
		stream1 = IntStream.of(30, 90, 70, 10);
		System.out.println(stream1.average().getAsDouble());
		
//		7. 요소의 수집
//		.collect()
//		파라미터로 전달되는 Collectors 객체에 구현된 방법대로
//		스트림의 요소를 수집한다.
//		수집의 의미는, 새로운 객체에 요소를 담는 것을 뜻한다.
//		미리 정의된 메서드를 쓰거나 사용자가 직접 Collector 인터페이스를
//		구현하여 자신만의 수집 방법을 정의할 수도 있다.
		
		System.out.println("===collect===");
//		1. 스트림을 배열이나 컬렉션으로 변환
//		toArray(), toCollection(), toList(), toSet(), toMap()
//		IntStream으로 만든 스트림을 Integer타입을 담은 Stream으로 변환
		Stream<Integer> st = Stream.of(30, 90, 70, 10);
//		스트림을 List로 바꾸기 위해 Collectors를 호출
		List<Integer> intList = st.collect(Collectors.toList());
		for (Integer integer : intList) {
			System.out.println(integer);
		}
		
//		2. 통계, 연산
//		counting(),
		st = Stream.of(30, 90, 70, 10);
		long counting = st.collect(Collectors.counting());
		System.out.println("counting: " + counting);
//		maxBy(), minBy(),
//		summingInt(), averagingInt()
		
//		3. 요소 소모와 같은 동작 수행
//		reducing(),
//		joining()
//		문자열 스트림의 요소들을 모두 연결하여 하나의 문자열을
//		반환하는 기능
		Stream<String> strString = Stream.of("천방지축", "어리둥절", "빙글빙글");
		String resultString = strString.collect(Collectors.joining());
		System.out.println(resultString);
		
//		4. 요소의 그룹화와 분할
//		groupingBy()
//		조건식에 따라 그룹화를 하는 기능
		strString = Stream.of("HTML", "CSS", "JAVA", "PHP");
//		문자열의 길이별로 그룹화를 하여
		Map<Object, List<String>> results = strString
				.collect(Collectors
						.groupingBy(e -> e.length()) // 길이별로 그룹화
						);
//		key값으로 길이가 들어간다. value값으로 요소들이
//		List타입으로 들어간다.
		
//		키 목록 출력: 3, 4
//		for (Object obj : results.keySet()) {
//			System.out.println(obj);
//		};
		for (Object obj : results.keySet()) {
			System.out.printf("======%s======\n", obj);
			for (String str : results.get(obj)) {
				System.out.println(str);
			}
		};
//		partitioningBy()
//		조건에 따라 분할하는 기능
//		노션에 작성되어 있으므로 강의에선 생략
		
		
	}

}
