package Lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WartoscBezwzglednaTest {

	@Test
	void getLiczba_when_object_initialized_positively() {
		var wartoscBezwzgledna = new WartoscBezwzgledna(10);
		var result = wartoscBezwzgledna.getLiczba();
		assertEquals(10, result);
	}
	@Test
	void getLiczba_when_object_initialized_negatively() {
		var wartoscBezwzgledna = new WartoscBezwzgledna(-10);
		var result = wartoscBezwzgledna.getLiczba();
		assertEquals(10, result);
	}

	@Test
	void setLiczba_when_object_initialized_with_1000() {
		var wartoscBezwzgledna = new WartoscBezwzgledna(1000);
		var result = wartoscBezwzgledna.getLiczba();
		assertEquals(0, result);
	}

	@Test
	void setLiczba_when_object_initialized_with_11() {
		var wartoscBezwzgledna = new WartoscBezwzgledna(11);
		var result = wartoscBezwzgledna.getLiczba();
		assertEquals(11, result);
	}

	@Test
	void validate_positive() {
		var value = 15;
		var result = WartoscBezwzgledna.validate(value);
		assertTrue(result);
	}
	@Test
	void validate_negatiive() {
		var value = 101;
		var result = WartoscBezwzgledna.validate(value);
		assertFalse(result);
	}

}