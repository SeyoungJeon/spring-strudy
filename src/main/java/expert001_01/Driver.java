package expert001_01;

public class Driver {

	public static void main(String[] args) {
		Tire tire = new KoreaTire();
		// Trie tire = new AmericaTire();
		
		Car car = new Car(tire);
		
		System.out.println(car.getTireBrand());
	}

}
