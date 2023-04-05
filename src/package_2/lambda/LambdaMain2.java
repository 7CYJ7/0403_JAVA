package package_2.lambda;
@FunctionalInterface
interface MyInterface {
	int calc(int x, int y, int z);
}
public class LambdaMain2 {

	public static void main(String[] args) {
		MyInterface bb = (x, y, z) -> { return (x+y)*z; };
		System.out.println(bb.calc(3, 5, 4));
		

	}

}
