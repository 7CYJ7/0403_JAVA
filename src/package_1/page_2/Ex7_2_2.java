package package_1.page_2;

public class Ex7_2_2 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}
class Parent2{ int x = 10;}
class Child2 {
	Parent2 parent = new Parent2();
	int x = 20; 
	void method() {
		System.out.println("x = " + x);
		System.out.println("Parent.x = " + parent.x);
	}
}  // 일반적인 객체생성 --> 포함관계
