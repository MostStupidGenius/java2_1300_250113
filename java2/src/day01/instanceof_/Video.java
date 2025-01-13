package day01.instanceof_;

public class Video {
	// 상속할 부모 클래스

	// 클래스 스스로 설명하는 메서드
	public void introduce() {
		System.out.println("Video 타입입니다.");
	}

	public static void main(String[] args) {
		Drama drama = new Drama();
		Movie movie = new Movie();
		Animation ani = new Animation();
		
		Video[] arrVid = {drama, movie, ani};
		for (Video video : arrVid) {
//			video.introduce();
//			instanceof
//			참조변수에 담긴 객체의 타입을 검사하는 연산자다.
//			instanceof 앞에 참조 변수가 오며,
//			뒤에는 확인할 대상 클래스 이름이 들어간다.
//			만약 참조변수가 해당 클래스 타입을 가졌다면
//			true를 반환한다.
			if(video instanceof Drama) {
				System.out.println("드라마");
			} else if (video instanceof Movie) {
				System.out.println("영화");
			} else if (video instanceof Animation) {
				System.out.println("애니");
			}
		}
	}
}
