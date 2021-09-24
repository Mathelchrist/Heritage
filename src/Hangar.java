
public class Hangar {
	public static void main(String[] args) {
		Car car = new Car();
		Boat boat = new Boat();
		car.setBrand("totoMobile");
		System.out.println(car.doStuff());
		boat.setBrand("TotoBato");
		System.out.println(boat.doStuff());

		
	}
}
