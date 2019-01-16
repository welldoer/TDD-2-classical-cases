package net.blogjava.prime_factors;

import static org.junit.Assert.*;

import static net.blogjava.prime_factors.PrimeFactors.generate;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOne() {
		assertEquals( list(), generate( 1 ) );
	}

	@Test
	public void testTwo() {
		assertEquals( list( 2 ), generate( 2 ) );
	}

	private List<Integer> list( int... ints ) {
		List<Integer> list = new ArrayList<>();
		for( int i : ints )
			list.add( i );
		return list;
	}

}
