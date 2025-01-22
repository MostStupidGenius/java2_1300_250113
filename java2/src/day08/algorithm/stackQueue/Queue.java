package day08.algorithm.stackQueue;

import java.util.ArrayList;

public class Queue<E> {

	ArrayList<E> data;

	{ // 인스턴스 블록
		// 인스턴스 클래스를 선언 및 초기화
		// 이 인스턴스 클래스 객체는
		// 외부 클래스의 객체에 귀속된 객체다.
		this.data = new ArrayList<E>();
	}

	public Queue() {
		super();
	}

	// 전달받은 요소를 데이터의 요소로 넣는 메서드
	public void add(E element) {
		this.data.add(element);
	}

	// 요소를 제거하는 메서드
	// Queue 자료구조는 먼저 들어온 데이터가 먼저 나가는 구조이므로
	// 0번째 요소만 제거하고 반환한다.
	public E remove() {
		// 만약 데이터에 담긴 요소의 개수가 0개라면
		if (this.data.size() == 0) {
			// 아무것도 하지 않고 메서드 종료
			// return 타입이 E이면 null 반환
			return null;
		}
		// 데이터에 담긴 요소 개수가 1개 이상이면
		// 0번째(첫번째) 요소를 제거
		E result = this.data.remove(0);
		return result;
	}

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.remove()); // 1
		System.out.println(q.remove()); // 2
		System.out.println(q.remove()); // 3
		System.out.println(q.remove()); // 4
		System.out.println(q.remove()); // null
		q.add(5);
		q.add(6);
		System.out.println(q.remove()); // 5
		System.out.println(q.remove()); // 6
		System.out.println(q.remove()); // null

	}

}
