package day04.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
//		Map 자료구조
//		- 키와 값의 한 쌍으로 이루어진 데이터를 저장하는 자료구조다.
//		- 데이터의 입력 순서를 무시한다 -> 인덱스 접근x
//		- 키는 중복이 불가능하며, 값에 접근하기 위해서는 키가 필요하다.
//		- 값은 키에 종속되기 때문에 중복이 가능하다.
//		HashMap 선언
//		HashMap<K, V> 참조변수명 ~~~
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		
//		1. 데이터 추가
//		키와 값 한 쌍을 전달하여 추가해야 한다.
//		만약 이전에 존재하던 키에 값을 넣으려고 한다면
//		해당 키의 값을 새로운 그 값으로 덮어씌운다.
//		.put(K, V)
		hashMap.put("이름", "홍길동");
		hashMap.put("나이", 30);
		hashMap.put("주소", "서울");
		hashMap.put("장발여부", false);
		hashMap.put("이름", "홍당무");
		
//		2. 데이터 조회
//		데이터를 가져올 때에는 키값을 이용해 가져와야 한다.
//		만약 전달된 키가 요소 중에 없다면 null 반환
//		.get(K)
//		바뀐 값 출력
		System.out.println(hashMap.get("이름")); // 홍당무
//		없는 키로 값에 접근하면 null 반환
		System.out.println(hashMap.get("성별")); // null
		
//		3. replace(K, V)
//		전달받은 키의 값을 전달받은 값으로 변경
//		만약 요소 중에 해당 키가 없다면 변경/추가 없이 함수 종료
		
		
//		4. 키 목록 가져오기
//		.keySet()
//		이 메서드를 사용하면 키 목록을 Set자료구조로 반환한다.
		Set<String> keys = hashMap.keySet();
		for (String string : keys) {
			System.out.println(string);
		}
		
//		5. keySet().iterator() -> Iterator<K>
//		키 목록을 이터레이터로 변환하여 반환
//		- 이터레이터란?
//		  이터레이터에는 여러 값이 담겨있는데, 이 값을
//		하나씩 순차적으로 가져오는 역할을 한다.
		Iterator<String> keyIter = hashMap.keySet().iterator();
		
//		만약 다음 요소가 있다면 반복 실행
		while(keyIter.hasNext()) {
//			다음 요소를 가져와 key에 담는다.
			String key = keyIter.next();
//			key를 출력한다.
			System.out.println(key);
		}
	}

}
