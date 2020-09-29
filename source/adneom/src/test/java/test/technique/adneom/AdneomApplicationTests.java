package test.technique.adneom;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import test.technique.adneom.service.IAdneomPartition;
import test.technique.adneom.service.impl.AdneomPartition;

@SpringBootTest
class AdneomApplicationTests {
	
	private IAdneomPartition adneomPartition;

	@Test
	void testTaille1() {
		adneomPartition = new AdneomPartition();
		final List<List<Object>> test = adneomPartition.partition(
				Arrays.asList(1,2,3,4,5), 1);
		assertTrue((test.size() == 5));
	}
	
	@Test
	void testTaille2() {
		adneomPartition = new AdneomPartition();
		final List<List<Object>> test = adneomPartition.partition(
				Arrays.asList(1,2,3,4,5), 2);
		assertTrue((test.size() == 3));
	}
	
	@Test
	void testTaille3() {
		adneomPartition = new AdneomPartition();
		final List<List<Object>> test = adneomPartition.partition(
				Arrays.asList(1,2,3,4,5), 3);
		assertTrue((test.size() == 2));
	}
	
	@Test
	void testTaille4() {
		adneomPartition = new AdneomPartition();
		final List<List<Object>> test = adneomPartition.partition(
				Arrays.asList(1,2,3,4,5), 4);
		assertTrue((test.size() == 2));
	}
	
	@Test
	void testTaille5() {
		adneomPartition = new AdneomPartition();
		final List<List<Object>> test = adneomPartition.partition(
				Arrays.asList(1,2,3,4,5), 5);
		assertTrue((test.size() == 1));
	}
	
	@Test
	void testTaille6() {
		adneomPartition = new AdneomPartition();
		final List<List<Object>> test = adneomPartition.partition(
				Arrays.asList(1,2,3,4,5), 6);
		assertTrue((test.size() == 1));
	}

}
