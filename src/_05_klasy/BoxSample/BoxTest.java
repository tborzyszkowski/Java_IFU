package _05_klasy.BoxSample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoxTest {
	@Test
	public void testBoxGetWidth() {
		// Arrange
		Box sut = new Box(1, 2, 3);
		// Act
		double result = sut.getWidth();
		// Assert
		assertEquals( 1, result, 0.001);
	}
	@Test
	public void test_volumeOfInitialBox_isZero(){
		Box sut = new Box();
		double volume = sut.volume();
		assertEquals( 0.0, volume, 0.0001);
	}
	@Test
	public void test_volumeOfUnitQube_isOne(){
		Box sut = new Box(1, 1, 1);
		double volume = sut.volume();
		assertEquals( 1.0, volume, 0.001);
	}

	@Test
	public void test_volumeOfOtherQube_isOne(){
		Box sut = new Box(1.5, 1.3, 1.2);
		double volume = sut.volume();
		assertEquals( 2.34, volume, 0.001);
	}

	@Test
	public void test_twoBoxes_areEqual(){
		Box sut1 = new Box(1, 1, 1);
		Box sut2 = new Box(1, 1, 1);
		assertTrue(sut1.equals(sut2));
	}
	@Test
	public void test_twoBoxes_areNotTheSame(){
		Box box1 = new Box();
		Box box2 = new Box();
		assertNotSame(box1, box2);
	}
	@Test
	public void test_twoBoxes_areTheSame(){
		Box box1 = new Box();
		Box box2 = box1;
		assertSame(box1, box2);
	}
	@Test
	public void test_twoBoxehashes_areNotEqual(){
		Box box1 = new Box();
		Box box2 = new Box();
		assertTrue( box1.hashCode() != box2.hashCode());
	}

}

