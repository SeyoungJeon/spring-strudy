package expert001_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {
	@Test
	public void 자동차_코리아타이어_장착_타이어브랜드_테스트() {
		Tire tire = new KoreaTire();
		Car car = new Car(tire);
		
		assertEquals("장착된 타이어 :코리아 타이어", car.getTireBrand());
	}

	@Test
	public void 자동차_미국타이어_장착_타이어브랜드_테스트() {
		Tire tire = new AmericaTire();
		Car car = new Car(tire);
		
		assertEquals("장착된 타이어 :미국 타이어", car.getTireBrand());
	}
	
}
