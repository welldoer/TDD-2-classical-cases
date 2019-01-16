package net.blogjava.prime_factors;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOne() {
		assertEquals( list(), PrimeFactors.generate( 1 ) );
	}

	private List<Integer> list() {
		return null;
	}

}
