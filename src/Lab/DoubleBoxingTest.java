package Lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleBoxingTest {
	@Test
	void by_reference_test() {
		var value = 10.0;
		var obiekt = new DoubleBoxing(value);
		DoubleBoxing.operationByReference(obiekt);
		var result = obiekt.getLiczba();
		assertEquals(20, result);
	}
	@Test
	void by_value_test() {
		var value = 10.0;
		DoubleBoxing.operationByValue(value);
		assertEquals(10, value);
	}

}