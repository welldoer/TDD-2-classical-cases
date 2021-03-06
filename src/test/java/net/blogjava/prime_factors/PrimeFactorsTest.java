package net.blogjava.prime_factors;

import static org.junit.Assert.*;

import static net.blogjava.prime_factors.PrimeFactors.generate;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.rules.ExpectedException;

public class PrimeFactorsTest {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIllegalConstruction() {
		expectedException.expect( IllegalStateException.class );
		expectedException.expectMessage( "Utility class");
		new PrimeFactors();
	}
	
	@Test
	public void testOne() {
		assertEquals( list(), generate( 1 ) );
	}

	@Test
	public void testTwo() {
		assertEquals( list( 2 ), generate( 2 ) );
	}

	@Test
	public void testThree() {
		assertEquals( list( 3 ), generate( 3 ) );
	}

	@Test
	public void testFour() {
		assertEquals( list( 2, 2 ), generate( 4 ) );
	}

	@Test
	public void testFiveAndSix() {
		assertEquals( list( 5 ), generate( 5 ) );
		assertEquals( list( 2, 3 ), generate( 6 ) );
	}

	@Test
	public void testEight() {
		assertEquals( list( 2, 2, 2 ), generate( 8 ) );
	}

	@Test
	public void testNine() {
		assertEquals( list( 3, 3 ), generate( 9 ) );
	}

	@Test
	public void test67() {
		assertEquals( list( 2, 3, 7 ), generate( 42 ) );
	}

	@Test
	public void test81() {
		assertEquals( list( 3, 3, 3, 3 ), generate( 81 ) );
	}

	@Test
	public void test105() {
		assertEquals( list( 3, 5, 7 ), generate( 105 ) );
	}

	@Test
	public void test252() {
		assertEquals( list( 2, 2, 3, 3, 7 ), generate( 252 ) );
	}

	private List<Integer> list( int... ints ) {
		List<Integer> list = new ArrayList<>();
		for( int i : ints )
			list.add( i );
		return list;
	}

}
