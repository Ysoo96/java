package Car;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}

	// final롤 선언된 메소드여서 오버라이드를 못 함
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}

}
