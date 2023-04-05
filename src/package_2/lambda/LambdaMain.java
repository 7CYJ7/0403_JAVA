package package_2.lambda;
@FunctionalInterface
interface InterfaceMy {
	int add(int x, int y);
}

public class LambdaMain {

	public static void main(String[] args) {
//		InterfaceMy aa = new InterfaceMy() { // 객체생성하듯이,  뒤에 중괄호, 중괄호끝에 ;
//
//			@Override
//			public int add(int x, int y) {
//				return x+y;
//			}
//			
//		};
//		System.out.println(aa.add(77, 99));
		
		InterfaceMy aa = (x, y) -> { return x+y; };   // 람다식, 앞에 함수형 인터페이스
		System.out.println(aa.add(22, 55));
		
		

	}

}
