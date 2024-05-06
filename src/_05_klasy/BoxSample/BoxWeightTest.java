package _05_klasy.BoxSample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxWeightTest {

	@Test
	void getWeight() {
		var box = new BoxWeight(10, 20, 30, 100);
		assertEquals(100, box.getWeight());
	}

	@Test
	void setDim() {
		var box = new BoxWeight(10, 20, 30, 100);
		box.setDim(100, 200, 300, 10);
		assertEquals(10, box.getWeight());
	}
}