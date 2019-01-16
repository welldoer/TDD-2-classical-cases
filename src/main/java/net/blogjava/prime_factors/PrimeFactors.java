package net.blogjava.prime_factors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	PrimeFactors() {
		throw new IllegalStateException( "Utility class" );
	}

	public static List<Integer> generate( int n ) {
		List<Integer> primes = new ArrayList<>();
		if( n > 1 )
			primes.add( n );
		return primes;
	}

}
