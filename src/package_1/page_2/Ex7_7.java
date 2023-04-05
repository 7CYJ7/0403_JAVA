package package_1.page_2;

class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;  // Car car = new Car(); 와 같다.
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;    // car = (Car)fe;에서 형변환이 생략됨   업캐스팅
//		car.water();
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가   다운캐스팅
		fe2.water();
		
		int a = 10;
		double b = 3.14;
		a = (int)b; // 강제형변환
		b = a; // 자동형변환           지역변수(메소드안)이기 때문에 객체생성 안해도됨.
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}
