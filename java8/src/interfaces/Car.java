package interfaces;

public class Car implements Vehicle, FourWheeler {

	@Override
	public void message() {
		Vehicle v = new Car();
		v.message();
	}
}
