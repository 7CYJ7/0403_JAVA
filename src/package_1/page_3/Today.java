package package_1.page_3;

class Lunch {
	public String lunch77() {
		String ss = "점심 맛있게 먹었나요?";
		return ss;
	}
}

public class Today {

	public static void main(String[] args) {
		Lunch lc = new Lunch() {  // 객체 생성하고 중괄호 열기.
			public String lunch77() { // 메소드 오버라이딩
				return "백반을 먹었습니다";
			}
		}; // 중괄호 뒤 세미콜론
		System.out.println(lc.lunch77());
		

	}

}
