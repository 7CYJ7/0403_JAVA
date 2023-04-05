package package_2.lambda;

interface Myfunction2 {
	int calc(int x);
}
public class LambdaEx2 {
	public static void main(String[] args) {
	
		Myfunction2 ff = new Myfunction2() {
			
			@Override
			public int calc(int x) {
				return x*x;
			}
		};
		System.out.println(5);
	}

}

	
