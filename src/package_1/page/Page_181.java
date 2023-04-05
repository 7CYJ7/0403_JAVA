package package_1.page;

public class Page_181 {
	int a = 80;
	static int b = 90;

	public static void main(String[] args) {
		MyMath mymath = new MyMath();
		System.out.println(mymath.add(50, 70));
		
		Page_181 nn = new Page_181();
		System.out.println(nn.a+b);   // 인스턴스 변수는 객체생성하여 사용. 클래스 변수는 객체 생성없이 사용가능.
		
		System.out.println(mymath.c+MyMath.d);

	}
}

	class MyMath {
		int c = 40;
		static int d = 30;
		long add(long a, long b) {
			long result = a+b;
			return result;
		}
	

}
